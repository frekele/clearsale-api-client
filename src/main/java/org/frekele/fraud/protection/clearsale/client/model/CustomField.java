package org.frekele.fraud.protection.clearsale.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fraud.protection.clearsale.client.core.ClearSaleEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomField implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Type")
    private Integer type;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Value")
    private String value;

    public CustomField() {
        super();
    }

    private CustomField(Builder builder) {
        setType(builder.type);
        setName(builder.name);
        setValue(builder.value);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static final class Builder {

        private Integer type;

        private String name;

        private String value;

        private Builder() {
        }

        public Builder withType(Integer val) {
            type = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withValue(String val) {
            value = val;
            return this;
        }

        public CustomField build() {
            return new CustomField(this);
        }
    }
}
