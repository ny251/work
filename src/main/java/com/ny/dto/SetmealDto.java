package com.ny.dto;

import com.ny.entity.Setmeal;
import com.ny.entity.SetmealDish;
import com.ny.entity.Setmeal;
import com.ny.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
