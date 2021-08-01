
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
 *         &lt;element name="divideReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "divideReturn"
})
@XmlRootElement(name = "divideResponse")
public class DivideResponse {

    protected int divideReturn;

    /**
     * Gets the value of the divideReturn property.
     * 
     */
    public int getDivideReturn() {
        return divideReturn;
    }

    /**
     * Sets the value of the divideReturn property.
     * 
     */
    public void setDivideReturn(int value) {
        this.divideReturn = value;
    }

}
