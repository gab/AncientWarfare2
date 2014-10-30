package net.shadowmage.ancientwarfare.npc.ai.faction;

import net.shadowmage.ancientwarfare.npc.ai.owned.NpcAIPlayerOwnedMedic;
import net.shadowmage.ancientwarfare.npc.entity.NpcBase;

public class NpcAIFactionPriest extends NpcAIPlayerOwnedMedic
{

public NpcAIFactionPriest(NpcBase npc)
  {
  super(npc);
  }

@Override
public boolean continueExecuting()
  {  
  if(targetToHeal==null || targetToHeal.isDead || targetToHeal.getHealth()>=targetToHeal.getMaxHealth()){return false;}  
  return super.continueExecuting();
  }

}