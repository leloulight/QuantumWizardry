package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.common.QuantumWizardry;
import messpace.QuantumWizardry.mob.EntityQuantumBoss;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModMobs {
	
	public static void init(){
		registerEntity();
	}
	
	public static void registerEntity(){
		createEntity(EntityQuantumBoss.class, "QuantumBoss", 0x099414, 0x0800FF);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, QuantumWizardry.instance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}

}
