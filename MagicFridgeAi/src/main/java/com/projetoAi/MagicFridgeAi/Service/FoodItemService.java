package com.projetoAi.MagicFridgeAi.Service;

import com.projetoAi.MagicFridgeAi.DTO.FoodItemDTO;
import com.projetoAi.MagicFridgeAi.DTO.FoodItemMapper;
import com.projetoAi.MagicFridgeAi.Model.FoodItem;
import com.projetoAi.MagicFridgeAi.Repository.FoodItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodItemService {

    //Injeção de dependência do meu Repository
    FoodItemRepository foodItemRepository;
    FoodItemMapper foodItemMapper;
    public FoodItemService(FoodItemRepository foodItemRepository, FoodItemMapper foodItemMapper){
        this.foodItemRepository = foodItemRepository;
        this.foodItemMapper = foodItemMapper;
    }

    //Buscar
    public List<FoodItemDTO> buscar(){
        List<FoodItem> items = foodItemRepository.findAll();
        return items.stream().map(item -> foodItemMapper.map(item)).toList();
    }

    //Buscar Por Id
    public FoodItemDTO buscarPorId(Long id){
        Optional<FoodItem> foodExiste = foodItemRepository.findById(id);
        return foodExiste.map(food -> foodItemMapper.map(food)).orElse(null);
    }

    //Cadastrar
    public FoodItemDTO cadastrar(FoodItemDTO foodItemDTO){
        FoodItem foodItem = foodItemMapper.map(foodItemDTO);
        foodItemRepository.save(foodItem);
        return foodItemMapper.map(foodItem);
    }

    //Excluir
    public void excluir(Long id){
        foodItemRepository.deleteById(id);
    }

    //Atualizar
    public FoodItemDTO atualizar(Long id, FoodItemDTO foodItemDTO){
        Optional<FoodItem> foodExiste = foodItemRepository.findById(id);
        if(foodExiste.isPresent()){
            FoodItem foodItem = foodItemMapper.map(foodItemDTO);
            foodItem.setId(id);
            foodItemRepository.save(foodItem);
            return foodItemMapper.map(foodItem);
        }

        return null;
    }



}
