package allbarkallbite_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class Scavenger {
    public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(48, 11).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 16.0F, 7.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(48, 11).mirror().addBox(-1.0F, 1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 16.0F, 7.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(24, 0).addBox(0.25F, 0.75F, -2.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-2.25F, 0.75F, -2.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 27).addBox(-3.5F, -2.0F, -6.0F, 7.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).mirror().addBox(-3.5F, -2.0F, -6.0F, 7.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 7).addBox(-3.5F, -3.0F, -3.0F, 7.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(19, 22).mirror().addBox(0.0F, -5.75F, 6.0F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(26, 43).addBox(-4.5F, -5.0F, -2.85F, 9.0F, 8.0F, 10.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_r1 = upper_body.addOrReplaceChild("mane_r1", CubeListBuilder.create().texOffs(20, 22).addBox(0.0F, -3.0F, -2.5F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0255F, 10.7479F, 0.4363F, 0.0F, 0.0F));

		PartDefinition mane_r2 = upper_body.addOrReplaceChild("mane_r2", CubeListBuilder.create().texOffs(20, 26).addBox(0.0F, -1.0F, 1.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(36, 32).addBox(-3.5F, 0.75F, -5.75F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.75F)), PartPose.offsetAndRotation(0.0F, -0.25F, 9.75F, -1.1345F, 0.0F, 0.0F));

		PartDefinition body_rotation_r1 = upper_body.addOrReplaceChild("body_rotation_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-11.75F, -4.0F, -20.75F, 7.0F, 8.0F, 3.0F, new CubeDeformation(0.7F)), PartPose.offsetAndRotation(0.0F, -9.25F, 15.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, -7.25F, -2.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 0).addBox(-3.0F, -6.25F, -6.25F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5F, -6.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(34, 17).addBox(-1.5F, -1.25F, -3.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.52F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 3.98F, 4.0F));

		PartDefinition mount_r1 = snout_lower.addOrReplaceChild("mount_r1", CubeListBuilder.create().texOffs(34, 24).addBox(-1.0F, -8.82F, -10.25F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0368F, 6.0892F, 0.4363F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -5.0F, -4.5F));

		PartDefinition head_r1 = right_ear.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(42, 11).addBox(-1.964F, -6.005F, -0.3733F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(34, 11).addBox(-2.964F, -4.005F, -0.8733F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.25F, 1.25F, 0.2285F, -0.1606F, -0.3867F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -5.0F, -4.5F));

		PartDefinition head_r2 = left_ear.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(42, 11).mirror().addBox(0.964F, -6.005F, -0.3733F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(34, 11).mirror().addBox(-0.036F, -4.005F, -0.8733F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.25F, 1.25F, 0.2285F, 0.1606F, 0.3867F));

		PartDefinition glowing_eyes = partdefinition.addOrReplaceChild("glowing_eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 13.5F, -7.0F));

		PartDefinition real_glowing_eyes = glowing_eyes.addOrReplaceChild("real_glowing_eyes", CubeListBuilder.create().texOffs(38, 6).addBox(-3.0F, -4.25F, -6.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
		.texOffs(38, 6).mirror().addBox(1.0F, -4.25F, -6.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}
