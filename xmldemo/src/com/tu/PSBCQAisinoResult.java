package com.tu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 结果实体XML
 *
 * @auther Tu
 * @date 2019/6/27
 * @email enum@foxmail.com
 */
@XmlRootElement(name = "string", namespace = "http://Golden.com/Golden/")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class PSBCQAisinoResult {
    private PSBCQAisinoOutput OUTPUT;

    public PSBCQAisinoOutput getOUTPUT() {
        return OUTPUT;
    }

    public void setOUTPUT(PSBCQAisinoOutput OUTPUT) {
        this.OUTPUT = OUTPUT;
    }

    @Override
    public String toString() {
        return "PSBCQAisinoResult{" +
                "OUTPUT=" + OUTPUT +
                '}';
    }
}
