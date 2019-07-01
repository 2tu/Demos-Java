package com.tu;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @auther Tu
 * @date 2019/6/27
 * @email enum@foxmail.com
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
public class PSBCQAisinoOutput {
    /**
     * ERR   OK
     */
    private String RESULT;
    private String MESSAGE;
    private String LEVEL;

    public String getRESULT() {
        return RESULT;
    }

    public void setRESULT(String RESULT) {
        this.RESULT = RESULT;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public String getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(String LEVEL) {
        this.LEVEL = LEVEL;
    }

    @Override
    public String toString() {
        return "PSBCQAisinoOutput{" +
                "RESULT='" + RESULT + '\'' +
                ", MESSAGE='" + MESSAGE + '\'' +
                ", LEVEL='" + LEVEL + '\'' +
                '}';
    }
}
