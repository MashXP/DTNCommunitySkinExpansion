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
import skinexpansion_dtn.models.EeveelutionEevee;
import skinexpansion_dtn.models.EeveelutionEspeon;
import skinexpansion_dtn.models.EeveelutionFlareon;
import skinexpansion_dtn.models.EeveelutionGlaceon;
import skinexpansion_dtn.models.EeveelutionJolteon;
import skinexpansion_dtn.models.EeveelutionLeafeon;
import skinexpansion_dtn.models.EeveelutionSylveon;
import skinexpansion_dtn.models.EeveelutionUmbreon;
import skinexpansion_dtn.models.EeveelutionVaporeon;
import skinexpansion_dtn.models.JakeAdventureTime;
import skinexpansion_dtn.models.Moonless;
import skinexpansion_dtn.models.Ninetales;
import skinexpansion_dtn.models.Oslo;
import skinexpansion_dtn.models.Remi;
import skinexpansion_dtn.models.Sniffa;

@Mod(Constants.MOD_ID)
public class DTNCommunitySkinExpansion {

    public DTNCommunitySkinExpansion() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            modEventBus.addListener(DTNCommunitySkinExpansion::registeringSkin);
            modEventBus.addListener(DTNCommunitySkinExpansion::registeringSkinJson);
            modEventBus.addListener(DTNCommunitySkinExpansion::registerLayerDefinition);
        });

    }

    public static void registeringSkin(RegisterCustomDogModelsEvent event) {
        event.register(new Builder(getRes("beowolf"), ModelLayerLocations.BEOWOLF)
            .withGlowingEyes().withAccessory());
        event.register(new Builder(getRes("ninetales"), ModelLayerLocations.NINETALES).withAccessory());
        event.register(new Builder(getRes("eeveelution_eevee"), ModelLayerLocations.EEVEELUTION_EEVEE).withAccessory());
        event.register(new Builder(getRes("eeveelution_flareon"), ModelLayerLocations.EEVEELUTION_FLAREON).withAccessory());
        event.register(new Builder(getRes("eeveelution_vaporeon"), ModelLayerLocations.EEVEELUTION_VAPOREON).withAccessory());
        event.register(new Builder(getRes("eeveelution_jolteon"), ModelLayerLocations.EEVEELUTION_JOLTEON).withAccessory());
        event.register(new Builder(getRes("eeveelution_espeon"), ModelLayerLocations.EEVEELUTION_ESPEON).withAccessory());
        event.register(new Builder(getRes("eeveelution_umbreon"), ModelLayerLocations.EEVEELUTION_UMBREON).withAccessory());
        event.register(new Builder(getRes("eeveelution_leafeon"), ModelLayerLocations.EEVEELUTION_LEAFEON).withAccessory());
        event.register(new Builder(getRes("eeveelution_glaceon"), ModelLayerLocations.EEVEELUTION_GLACEON).withAccessory());
        event.register(new Builder(getRes("eeveelution_sylveon"), ModelLayerLocations.EEVEELUTION_SYLVEON).withAccessory());
        event.register(new Builder(getRes("moonless"), ModelLayerLocations.MOONLESS)
            .withGlowingEyes().withAccessory());
        event.register(new Builder(getRes("oslo_nanatsu"), ModelLayerLocations.OSLO).withAccessory());
        event.register(new Builder(getRes("jake_adventure_time"), ModelLayerLocations.JAKE_ADVENTURE_TIME).withAccessory()
            .withCustomRootPivot(new Vector3f(0, 19, 0)));
        event.register(new Builder(getRes("remi"), ModelLayerLocations.REMI).withAccessory());
        event.register(new Builder(getRes("sniffa"), ModelLayerLocations.SNIFFA).withAccessory());

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
        event.registerLayerDefinition(ModelLayerLocations.EEVEELUTION_EEVEE, EeveelutionEevee::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.EEVEELUTION_FLAREON, EeveelutionFlareon::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.EEVEELUTION_VAPOREON, EeveelutionVaporeon::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.EEVEELUTION_JOLTEON, EeveelutionJolteon::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.EEVEELUTION_ESPEON, EeveelutionEspeon::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.EEVEELUTION_UMBREON, EeveelutionUmbreon::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.EEVEELUTION_LEAFEON, EeveelutionLeafeon::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.EEVEELUTION_GLACEON, EeveelutionGlaceon::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.EEVEELUTION_SYLVEON, EeveelutionSylveon::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.MOONLESS, Moonless::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.OSLO, Oslo::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.JAKE_ADVENTURE_TIME, JakeAdventureTime::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.REMI, Remi::createBodyLayer);
        event.registerLayerDefinition(ModelLayerLocations.SNIFFA, Sniffa::createBodyLayer);
   }

    public static ResourceLocation getRes(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
    
}
