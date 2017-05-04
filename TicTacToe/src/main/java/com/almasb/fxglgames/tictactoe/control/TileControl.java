package com.almasb.fxglgames.tictactoe.control;

import com.almasb.fxgl.ecs.AbstractControl;
import com.almasb.fxgl.ecs.Entity;
import com.almasb.fxgl.ecs.component.Required;
import com.almasb.fxglgames.tictactoe.TileValueComponent;
import com.almasb.fxglgames.tictactoe.TileValue;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
@Required(TileValueComponent.class)
public class TileControl extends AbstractControl {

    @Override
    public void onUpdate(Entity entity, double tpf) {}

    /**
     * @param value tile value
     * @return true if marking succeeded
     */
    public boolean mark(TileValue value) {
        TileValueComponent valueComponent = getEntity().getComponentUnsafe(TileValueComponent.class);

        if (valueComponent.getValue() != TileValue.NONE)
            return false;

        valueComponent.setValue(value);

        return true;
    }
}