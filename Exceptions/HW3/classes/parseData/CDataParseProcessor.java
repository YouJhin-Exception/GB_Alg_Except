package Exceptions.HW3.classes.parseData;

import Exceptions.HW3.abstracts.ADataParseProcessor;
import Exceptions.HW3.exceptions.FullNameReadFromDataException;
import Exceptions.HW3.exceptions.GetDataArrayException;
import Exceptions.HW3.exceptions.ParseDataException;
import Exceptions.HW3.exceptions.ParseDataToIntegerException;

// парсер входящих строк
public class CDataParseProcessor extends ADataParseProcessor {
    private String data;
    private String[] dataArray;
    private final String[] fullName;
    private String birthday;
    private long phoneNumber;
    private String sex;

    public CDataParseProcessor() {
        this.data = "";
        this.fullName = new String[3];
        this.birthday = "";
        this.phoneNumber = 0;
        this.sex = "";
    }

    @Override
    public String[] getFullName() {
        return this.fullName;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    @Override
    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    // делаем строку по условию задания для записи в фаил <><><><>  // check
    @Override
    public String[] getInfoToWrite() {
        String[] infoArray = new String[2];
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(this.fullName[0]).append(">").append("<").append(this.fullName[1]).append(">").append("<").append(this.fullName[2]).append(">");
        sb.append("<").append(this.birthday).append(">").append("<").append(this.phoneNumber).append(">").append("<").append(this.sex).append(">");

        infoArray[0] = this.fullName[0]; // фамилия для поиска
        infoArray[1] = sb.toString();
        sb = new StringBuilder();
        return infoArray;
    }

    // раскладываем по элементам,  data - строка из ui
    @Override
    public void parseData(String data) {
        this.data = data;
        this.dataArray = this.data.split(" ");

        try {
            for (int i = 0; i < dataArray.length; i++) {
                if (this.dataArray[i].length() == 1) this.sex = this.dataArray[i];
                else if ((Character.isDigit(this.dataArray[i].charAt(0))) && this.dataArray[i].contains("."))
                    this.birthday = this.dataArray[i];
                else if ((Character.isDigit(this.dataArray[i].charAt(0))) && !(this.dataArray[i].contains(".")))
                    try {
                        this.phoneNumber = Long.parseLong(this.dataArray[i]);
                    } catch (NumberFormatException ex) {
                        throw new ParseDataToIntegerException(ex.getMessage());
                    }
                else {
                    try {
                        this.fullName[0] = this.dataArray[i];
                        this.fullName[1] = this.dataArray[i + 1];
                        this.fullName[2] = this.dataArray[i + 2];
                        i += 2; // уходим от ФИО
                    } catch (IndexOutOfBoundsException ex) {
                        throw new FullNameReadFromDataException(ex.getMessage());
                    }

                }
            }
        } catch (RuntimeException ex) {
            throw new ParseDataException(ex.getMessage());
        }


    }

    // geter после парса возвращающий массив
    public String[] getDataArray() {
        if (dataArray == null)
            throw new GetDataArrayException();
        return dataArray;
    }

}