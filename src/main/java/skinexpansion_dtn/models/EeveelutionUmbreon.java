package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EeveelutionUmbreon {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.25F, 7.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(9, 16).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 10).addBox(-2.0F, 1.0F, -2.4F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(6, 16).addBox(-2.0F, -0.25F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, 1.5318F, -0.0443F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(7, 17).addBox(-1.0F, 3.0F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-1.05F)), PartPose.offsetAndRotation(-0.5F, 3.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(6, 16).addBox(-1.0F, 2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-1.05F)), PartPose.offsetAndRotation(-1.0F, 1.75F, -0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail_r3 = real_tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(6, 16).addBox(-1.0F, 2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(34, 20).mirror().addBox(-1.0F, -0.7F, -1.05F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(56, 19).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 16.0F, 5.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 20).addBox(-1.0F, -0.7F, -1.05F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.5F, 16.0F, 5.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.25F, 2.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition body_rotation_r1 = body.addOrReplaceChild("body_rotation_r1", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -4.0F, -13.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -0.1962F, 10.1628F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.0F, 14.25F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(24, 2).addBox(-2.0F, -4.0F, -1.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(-1.0F, -2.5F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.0578F, -2.8292F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.5796F, -2.8382F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
		.texOffs(0, 10).addBox(-1.5F, -0.598F, -2.6F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.151F)), PartPose.offset(0.0F, 0.88F, 0.5F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, -2.5F, -0.75F, 0.0F, -0.7854F, 0.6109F));

		PartDefinition head_r1 = left_ear.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(16, 13).mirror().addBox(0.0F, -2.6382F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.3618F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition head_r2 = left_ear.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(0.0F, -4.6382F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-0.3056F, -3.0551F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition head_r3 = left_ear.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(39, 13).addBox(0.0F, -4.6382F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5556F, -2.0051F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition head_r4 = left_ear.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(39, 13).addBox(-1.3727F, -2.3934F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2389F, -2.9299F, -0.5F, -3.1378F, -0.0872F, 3.0978F));

		PartDefinition head_r5 = left_ear.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(16, 13).addBox(-1.1889F, -0.0701F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.0889F, -2.9299F, -0.5F, 3.1081F, -0.0806F, -2.7475F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, -2.5F, -0.75F, 0.0F, 0.7854F, -0.6109F));

		PartDefinition head_r6 = right_ear.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(-2.0F, -4.6382F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.5556F, -2.0051F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition head_r7 = right_ear.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(-0.6273F, -2.3934F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2389F, -2.9299F, -0.5F, -3.1378F, 0.0872F, -3.0978F));

		PartDefinition head_r8 = right_ear.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(16, 13).mirror().addBox(0.1889F, -0.0701F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0889F, -2.9299F, -0.5F, 3.1081F, 0.0806F, 2.7475F));

		PartDefinition head_r9 = right_ear.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(16, 13).addBox(-1.0F, -2.6382F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1F, -0.3618F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition head_r10 = right_ear.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(39, 13).addBox(-2.0F, -4.6382F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.3056F, -3.0551F, 0.0F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}
