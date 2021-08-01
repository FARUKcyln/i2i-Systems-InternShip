
package com.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiplyReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "multiplyReturn"
})
@XmlRootElement(name = "multiplyResponse")
public class MultiplyResponse {

    protected int multiplyReturn;

    /**
     * Gets the value of the multiplyReturn property.
     * 
     */
    public int getMultiplyReturn() {
        return multiplyReturn;
    }

    /**
     * Sets the value of the multiplyReturn property.
     * 
     */
    public void setMultiplyReturn(int value) {
        this.multiplyReturn = value;
    }

}
