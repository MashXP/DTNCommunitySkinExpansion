package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EeveelutionGlaceon {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(54, 18).addBox(-0.5F, 1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(54, 18).addBox(-0.5F, -0.75F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 7.7126F, 4.0889F, 1.7017F, 0.0F, 0.0F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(54, 18).addBox(-0.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-1.0F, 5.7675F, 0.6483F, 1.1345F, 0.0F, 0.0F));

		PartDefinition tail_r3 = real_tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(47, 23).addBox(0.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-1.0F, 2.5008F, 0.0513F, 0.3927F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-1.0F, -0.7F, -1.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-1.0F, -0.7F, -1.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 16.0F, -3.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, 16.0F, -3.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.25F, 2.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition body_rotation_r1 = body.addOrReplaceChild("body_rotation_r1", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -4.0F, -13.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -0.1962F, 10.4128F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.0F, 14.25F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(22, 2).addBox(-2.0F, -4.5F, -0.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(-1.0F, -2.5F, -0.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.75F, -6.25F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.9F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = real_head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(54, 1).mirror().addBox(-1.55F, -1.25F, -1.75F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false)
		.texOffs(54, 1).mirror().addBox(-1.55F, -1.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(54, 1).addBox(-1.45F, -1.25F, -1.75F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F))
		.texOffs(54, 1).addBox(-1.45F, -1.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head_r2 = real_head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(53, 1).addBox(-1.6F, -2.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F))
		.texOffs(54, 1).addBox(-1.5F, -2.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-1.5F, -2.25F, -2.25F, -0.4363F, 0.7854F, 0.0F));

		PartDefinition head_r3 = real_head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(54, 1).mirror().addBox(-0.5F, -2.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false)
		.texOffs(53, 1).mirror().addBox(-0.4F, -2.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(1.5F, -2.25F, -2.25F, -0.4363F, -0.7854F, 0.0F));

		PartDefinition head_r4 = real_head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(56, 10).mirror().addBox(-0.8232F, 1.754F, 0.1964F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(2.9314F, -0.6462F, -2.0171F, -1.0775F, -0.8401F, -0.0872F));

		PartDefinition head_r5 = real_head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(56, 27).mirror().addBox(-0.8232F, 0.0122F, -0.7322F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.9314F, -0.6462F, -2.0171F, -0.7284F, -0.8401F, -0.0872F));

		PartDefinition head_r6 = real_head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(54, 1).mirror().addBox(-1.0F, -0.75F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(2.8048F, -0.6874F, -1.6406F, -0.7396F, -0.8249F, 0.0948F));

		PartDefinition head_r7 = real_head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(54, 1).mirror().addBox(0.0F, -0.75F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offsetAndRotation(1.5F, -2.5F, -1.75F, -0.5651F, -0.8249F, 0.0948F));

		PartDefinition head_r8 = real_head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(56, 10).mirror().addBox(-0.8232F, 1.6857F, 0.91F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false), PartPose.offsetAndRotation(2.9314F, -0.6462F, -2.0171F, -1.2957F, -0.8401F, -0.0872F));

		PartDefinition head_r9 = real_head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(53, 1).mirror().addBox(-1.0F, -1.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(1.5F, -2.25F, -2.25F, -0.1745F, -0.7854F, 0.0F));

		PartDefinition head_r10 = real_head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(54, 1).addBox(-2.0F, -0.75F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(-1.5F, -2.5F, -1.75F, -0.5651F, 0.8249F, -0.0948F));

		PartDefinition head_r11 = real_head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(56, 10).addBox(-1.1768F, 1.6857F, 0.91F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(-2.9314F, -0.6462F, -2.0171F, -1.2957F, 0.8401F, 0.0872F));

		PartDefinition head_r12 = real_head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(56, 10).addBox(-1.1768F, 1.754F, 0.1964F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-2.9314F, -0.6462F, -2.0171F, -1.0775F, 0.8401F, 0.0872F));

		PartDefinition head_r13 = real_head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(56, 27).addBox(-1.1768F, 0.0122F, -0.7322F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.9314F, -0.6462F, -2.0171F, -0.7284F, 0.8401F, 0.0872F));

		PartDefinition head_r14 = real_head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(54, 1).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-2.8048F, -0.6874F, -1.6406F, -0.7396F, 0.8249F, -0.0948F));

		PartDefinition head_r15 = real_head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(53, 1).addBox(-2.0F, -1.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-1.5F, -2.25F, -2.25F, -0.1745F, 0.7854F, 0.0F));

		PartDefinition head_r16 = real_head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(54, 1).addBox(-1.0F, -2.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.25F, -0.4363F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offset(0.0F, 1.75F, -1.25F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.0578F, -2.8292F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.5796F, -2.8382F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
		.texOffs(0, 10).addBox(-1.5F, -0.598F, -2.6F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.251F)), PartPose.offset(0.0F, 0.63F, 0.5F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(17, 14).addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.75F, -2.5F, -0.75F, 0.0F, -0.7854F, 0.6109F));

		PartDefinition head_r17 = left_ear.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(17, 14).addBox(0.1F, -3.7382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition head_r18 = left_ear.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(17, 14).mirror().addBox(-0.25F, -4.1382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r19 = left_ear.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(44, 14).addBox(-2.2F, -4.6382F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(4.15F, -0.9118F, 0.0F, 0.0F, 0.0F, -0.1833F));

		PartDefinition head_r20 = left_ear.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(43, 14).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6082F, -2.8129F, 0.0F, 0.0F, 0.0F, 0.192F));

		PartDefinition head_r21 = left_ear.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(43, 14).addBox(-2.4F, -3.6382F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r22 = left_ear.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(17, 14).addBox(-0.5F, -4.1382F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(17, 14).mirror().addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.75F, -2.5F, -0.75F, 0.0F, 0.7854F, -0.6109F));

		PartDefinition head_r23 = right_ear.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6082F, -2.8129F, 0.0F, 0.0F, 0.0F, -0.192F));

		PartDefinition head_r24 = right_ear.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(-0.6F, -3.6382F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r25 = right_ear.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(17, 14).mirror().addBox(-0.5F, -4.1382F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition head_r26 = right_ear.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(44, 14).mirror().addBox(0.2F, -4.6382F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-4.15F, -0.9118F, 0.0F, 0.0F, 0.0F, 0.1833F));

		PartDefinition head_r27 = right_ear.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(17, 14).addBox(-0.75F, -4.1382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r28 = right_ear.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(17, 14).mirror().addBox(-1.1F, -3.7382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}
