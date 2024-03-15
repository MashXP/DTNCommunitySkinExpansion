package allbarkallbite_dtn;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class LayerDefinitions {
    public static LayerDefinition abab_dog() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 19.0F, -2.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 19.0F, -2.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 19.0F, 7.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 19.0F, 7.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(32, 18).addBox(-4.0F, -6.5F, -6.0F, 8.0F, 13.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.0F, 2.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -3.5F, -5.5F, 9.0F, 7.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-4.0F, -3.5F, -3.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 17.0F, -1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition tag = upper_body.addOrReplaceChild("tag", CubeListBuilder.create().texOffs(40, 11).addBox(-1.0F, -7.75F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 2.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 12.4F, -4.5F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(29, 0).addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -4.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(32, 33).addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.02F, 2.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(32, 35).addBox(-1.5F, -0.5F, -3.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.52F, 1.75F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.5F, -0.25F));

		PartDefinition head_r1 = right_ear.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(24, 18).addBox(-1.4918F, -3.3116F, -0.1963F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0881F, -0.5689F, -0.0678F, 0.2285F, -0.1606F, -0.3867F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -1.5F, -0.25F));

		PartDefinition head_r2 = left_ear.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(24, 18).mirror().addBox(-1.5082F, -3.3116F, -0.1963F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0881F, -0.5689F, -0.0678F, 0.2285F, 0.1606F, 0.3867F));

		return LayerDefinition.create(meshdefinition, 51, 51);
	}
}
