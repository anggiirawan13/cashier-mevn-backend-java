package com.wanpos.app.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NonNull
public class CategoryUpdateRequest implements Serializable {

    @JsonProperty(value = "uuid")
    private String uuid;

    @JsonProperty(value = "category_code")
    private String categoryCode;

    @JsonProperty(value = "category_name")
    private String categoryName;

}