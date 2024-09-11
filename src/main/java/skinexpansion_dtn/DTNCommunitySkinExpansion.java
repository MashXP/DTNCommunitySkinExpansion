package skinexpansion_dtn;
import org.joml.Vector3f;

import doggytalents.api.events.RegisterCustomDogModelsEvent;
import doggytalents.api.events.RegisterDogSkinJsonPathEvent;
import doggytalents.api.fabric_helper.entry.DogModelConfiguationRegistry.Context;
import doggytalents.api.fabric_helper.entry.DogModelConfigurationEntry;
import skinexpansion_dtn.forge_imitate.event.EntityRenderersEvent.RegisterLayerDefinitions;
import doggytalents.api.events.RegisterCustomDogModelsEvent.DogModelProps.Builder;
import net.minecraft.resources.ResourceLocation;
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
import skinexpansion_dtn.models.Ninetales;

//@Mod(Constants.MOD_ID)
public class DTNCommunitySkinExpansion implements DogModelConfigurationEntry {

    // public DTNCommunitySkinExpansion() {
    //     IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    //     DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
    //         modEventBus.addListener(DTNCommunitySkinExpansion::registeringSkin);
    //         modEventBus.addListener(DTNCommunitySkinExpansion::registeringSkinJson);
    //         modEventBus.addListener(DTNCommunitySkinExpansion::registerLayerDefinition);
    //     });

    // }

    public static void registeringSkin(RegisterCustomDogModelsEvent event) {
        event.register(new Builder(getRes("beowolf"), ModelLayerLocations.BEOWOLF));
        event.register(new Builder(getRes("ninetales"), ModelLayerLocations.NINETALES));
        event.register(new Builder(getRes("eeveelution_eevee"), ModelLayerLocations.EEVEELUTION_EEVEE));
        event.register(new Builder(getRes("eeveelution_flareon"), ModelLayerLocations.EEVEELUTION_FLAREON));
        event.register(new Builder(getRes("eeveelution_vaporeon"), ModelLayerLocations.EEVEELUTION_VAPOREON));
        event.register(new Builder(getRes("eeveelution_jolteon"), ModelLayerLocations.EEVEELUTION_JOLTEON));
        event.register(new Builder(getRes("eeveelution_espeon"), ModelLayerLocations.EEVEELUTION_ESPEON));
        event.register(new Builder(getRes("eeveelution_umbreon"), ModelLayerLocations.EEVEELUTION_UMBREON));
        event.register(new Builder(getRes("eeveelution_leafeon"), ModelLayerLocations.EEVEELUTION_LEAFEON));
        event.register(new Builder(getRes("eeveelution_glaceon"), ModelLayerLocations.EEVEELUTION_GLACEON));
        event.register(new Builder(getRes("eeveelution_sylveon"), ModelLayerLocations.EEVEELUTION_SYLVEON));

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
   }

    public static ResourceLocation getRes(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }

    @Override
    public void onGatherDogModel(Context ctx) {
        registerLayerDefinition(new RegisterLayerDefinitions());
        registeringSkinJson(ctx.skinJsonEvent());
        registeringSkin(ctx.propsEvent());
    }
    
}