package com.projetoAi.MagicFridgeAi.DTO;

import com.projetoAi.MagicFridgeAi.Model.FoodItem;
import org.springframework.stereotype.Component;

@Component
public class FoodItemMapper {
    //Map para converter Model em DTO
   public FoodItem map(FoodItemDTO foodItemDTO){
        FoodItem foodItem = new FoodItem();
        foodItem.setId(foodItemDTO.getId());
        foodItem.setNome(foodItemDTO.getNome());
        foodItem.setQuantidade(foodItemDTO.getQuantidade());
        foodItem.setCategoria(foodItemDTO.getCategoria());
        foodItem.setValidade(foodItemDTO.getValidade());
        return foodItem;
    }

    //Map para converter DTO em Model
    public FoodItemDTO map(FoodItem foodItem){
       FoodItemDTO foodItemDTO = new FoodItemDTO();
       foodItemDTO.setId(foodItem.getId());
       foodItemDTO.setNome(foodItem.getNome());
       foodItemDTO.setCategoria(foodItem.getCategoria());
       foodItemDTO.setQuantidade(foodItem.getQuantidade());
       foodItemDTO.setValidade(foodItem.getValidade());
       return foodItemDTO;
    }

}
