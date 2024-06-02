package skinexpansion_dtn;
import org.joml.Vector3f;

import doggytalents.api.events.RegisterCustomDogModelsEvent;
import doggytalents.api.events.RegisterDogSkinJsonPathEvent;
import doggytalents.api.events.RegisterCustomDogModelsEvent.DogModelProps.Builder;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import skinexpansion_dtn.models.Beowolf;
import skinexpansion_dtn.models.Ninetales;

@Mod(Constants.MOD_ID)
public class DTNSkinExpansion {

    public DTNSkinExpansion() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            modEventBus.addListener(DTNSkinExpansion::registeringSkin);
            modEventBus.addListener(DTNSkinExpansion::registeringSkinJson);
            modEventBus.addListener(DTNSkinExpansion::registerLayerDefinition);
        });

    }

    public static void registeringSkin(RegisterCustomDogModelsEvent event) {
        event.register(new Builder(getRes("beowolf"), ModelLayerLocations.BEOWOLF));
        event.register(new Builder(getRes("ninetales"), ModelLayerLocations.NINETALES));

    //CUSTOMIZABLE REGISTERS
        // event.register(new Builder(getRes("chihuahua"), ModelLayerLocations.CHIHUAHUA)
        //     .withDefaultScale(0.704f));

        // event.register(new Builder(getRes("wolf"), ModelLayerLocations.BD_WOLF)
        //     .withGlowingEyes());

        // event.register(new Builder(getRes("pomeranian"), ModelLayerLocations.POMERANIAN)
        //     .withCustomRootPivot(new Vector3f(0, 17, 0)));
       
    }

    public static void registeringSkinJson(RegisterDogSkinJsonPathEvent event) {
        event.register(Constants.SKIN_JSON_PATH);
    }

    public static void registerLayerDefinition(RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelLayerLocations.BEOWOLF, Beowolf::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.NINETALES, Ninetales::createBodyLayer);
   }

    public static ResourceLocation getRes(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
    
}
