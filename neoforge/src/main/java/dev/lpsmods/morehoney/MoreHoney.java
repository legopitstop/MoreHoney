package dev.lpsmods.morehoney;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MoreHoney {

    public MoreHoney(IEventBus eventBus) {
        Bootstrap.init();
    }
}