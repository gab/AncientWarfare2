package net.shadowmage.ancientwarfare.npc.entity.faction;

import net.minecraft.world.World;

public class NpcCustom_2Archer extends NpcFactionArcher {

    public NpcCustom_2Archer(World par1World) {
        super(par1World);
    }

    @Override
    public String getNpcType() {
        return "custom_2.archer";
    }

}
