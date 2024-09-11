package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EeveelutionEspeon {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.0F, 8.0F, 1.6144F, 0.0F, 0.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(9, 18).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.75F, 10.0863F, 8.8175F, 1.7123F, 0.3892F, 0.054F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.75F, 10.0863F, 8.8175F, 1.7123F, -0.3892F, -0.054F));

		PartDefinition tail_r3 = real_tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(9, 18).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0F, 10.7126F, 4.3389F, 1.7017F, 0.0F, 0.0F));

		PartDefinition tail_r4 = real_tail.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(9, 18).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0F, 8.7675F, 0.8983F, 1.1345F, 0.0F, 0.0F));

		PartDefinition tail_r5 = real_tail.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(9, 18).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0F, 5.0008F, -0.1987F, 0.3927F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.0F, 0.3F, -1.8F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-1.0F, 0.3F, -1.8F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.25F, 2.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition body_rotation_r1 = body.addOrReplaceChild("body_rotation_r1", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -4.0F, -13.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -0.1962F, 10.4128F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.0F, 14.25F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(24, 2).addBox(-2.0F, -4.0F, -1.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(-1.0F, -2.0F, -1.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(60, 1).addBox(-0.5F, -1.75F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(49, 3).addBox(2.25F, -0.4F, -2.2F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F))
		.texOffs(48, 3).addBox(0.55F, 0.5F, -2.25F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F))
		.texOffs(49, 3).mirror().addBox(-5.25F, -0.4F, -2.2F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(48, 3).mirror().addBox(-4.55F, 0.5F, -2.25F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = real_head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-4.3636F, 1.8704F, -1.1F, 0.0F, 0.0F, -0.48F));

		PartDefinition head_r2 = real_head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(49, 4).mirror().addBox(-5.0F, -10.5F, -8.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.776F, 9.0608F, 6.3F, 0.0F, 0.0F, -0.3054F));

		PartDefinition head_r3 = real_head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(50, 4).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(4.3636F, 1.8704F, -1.1F, 0.0F, 0.0F, 0.48F));

		PartDefinition head_r4 = real_head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(49, 4).addBox(2.0F, -10.5F, -8.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.776F, 9.0608F, 6.3F, 0.0F, 0.0F, 0.3054F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.0578F, -2.8292F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.5796F, -2.8382F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
		.texOffs(0, 10).addBox(-1.5F, -0.598F, -2.6F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.251F)), PartPose.offset(0.0F, 0.88F, 0.5F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(17, 14).addBox(0.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.75F, -2.5F, -0.75F, 0.0F, -0.7854F, 0.6109F));

		PartDefinition head_r5 = left_ear.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(17, 14).addBox(0.0F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition head_r6 = left_ear.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(45, 14).mirror().addBox(0.0F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r7 = left_ear.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(44, 14).addBox(-2.0F, -4.6382F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(4.15F, -0.9118F, 0.0F, 0.0F, 0.0F, -0.1833F));

		PartDefinition head_r8 = left_ear.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(43, 14).addBox(-2.0F, -5.6382F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.25F, -0.6118F, 0.0F, 0.0F, 0.0F, 0.192F));

		PartDefinition head_r9 = left_ear.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(43, 14).addBox(-2.0F, -4.6382F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r10 = left_ear.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(45, 14).addBox(0.0F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(17, 14).mirror().addBox(-1.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.75F, -2.5F, -0.75F, 0.0F, 0.7854F, -0.6109F));

		PartDefinition head_r11 = right_ear.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(0.0F, -5.6382F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.25F, -0.6118F, 0.0F, 0.0F, 0.0F, -0.192F));

		PartDefinition head_r12 = right_ear.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(-1.0F, -4.6382F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r13 = right_ear.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(45, 14).mirror().addBox(-1.0F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition head_r14 = right_ear.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(44, 14).mirror().addBox(0.0F, -4.6382F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-4.15F, -0.9118F, 0.0F, 0.0F, 0.0F, 0.1833F));

		PartDefinition head_r15 = right_ear.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(45, 14).addBox(-1.0F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r16 = right_ear.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(17, 14).mirror().addBox(-1.0F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}
