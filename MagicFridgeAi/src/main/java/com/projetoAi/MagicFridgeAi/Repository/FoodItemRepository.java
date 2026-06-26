package com.projetoAi.MagicFridgeAi.Repository;

import com.projetoAi.MagicFridgeAi.Model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
