package com.ny.dto;

import com.ny.entity.Dish;
import com.ny.entity.DishFlavor;
import com.ny.entity.Dish;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
