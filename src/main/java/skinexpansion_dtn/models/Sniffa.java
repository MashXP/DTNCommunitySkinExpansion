package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class Sniffa {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 6.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(9, 18).addBox(0.0F, -1.5F, -0.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 2.8026F, 4.4366F, 1.6144F, 0.0F, 0.0F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(8, 17).addBox(0.0F, -1.5F, -0.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 4.4304F, 2.6187F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail_r3 = real_tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(8, 17).addBox(0.0F, -1.5F, -0.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.5571F, 0.2784F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail_r4 = real_tail.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(8, 17).addBox(0.0F, -1.5F, -0.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.0F, 2.4334F, -0.705F, -1.0908F, 0.0F, 0.0F));

		PartDefinition tail_r5 = real_tail.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(8, 17).addBox(0.0F, -1.5F, -0.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-1.0F, -0.0666F, -0.805F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 19.0F, 6.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 19.0F, 6.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).mirror().addBox(-1.0F, -0.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offset(-1.5F, 19.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(1.5F, 19.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -3.25F, -3.25F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 17.0F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(23, 1).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(23, 1).addBox(-3.0F, -3.25F, -2.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.25F))
		.texOffs(24, 2).addBox(-3.5F, -2.75F, -2.75F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F))
		.texOffs(25, 3).mirror().addBox(1.5F, -2.75F, -1.75F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(23, 1).mirror().addBox(1.0F, -3.25F, -2.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.35F)).mirror(false)
		.texOffs(25, 3).mirror().addBox(1.75F, -2.5F, -2.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(26, 4).mirror().addBox(1.85F, -0.75F, 0.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(27, 5).mirror().addBox(1.95F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(27, 5).addBox(-3.95F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
		.texOffs(25, 3).mirror().addBox(1.75F, -1.75F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(28, 6).mirror().addBox(0.75F, -1.0F, 3.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(30, 6).mirror().addBox(-0.7F, -1.5F, 2.65F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(27, 5).mirror().addBox(1.1F, -0.25F, 1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false)
		.texOffs(23, 1).addBox(-1.75F, -3.75F, -2.9F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F))
		.texOffs(23, 1).mirror().addBox(-0.25F, -3.25F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(23, 1).mirror().addBox(-0.75F, -4.0F, -2.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(30, 6).addBox(-0.5F, -0.75F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F))
		.texOffs(25, 3).addBox(-3.75F, -1.75F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
		.texOffs(27, 5).addBox(-1.5F, -0.9F, 2.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
		.texOffs(27, 5).addBox(-3.4F, -0.75F, 1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F))
		.texOffs(27, 5).addBox(-2.75F, -1.0F, 2.55F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 17.25F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(26, 3).addBox(-1.0F, 0.0F, 0.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-1.5F, -4.5F, 1.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 14.5F, -6.25F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(46, 21).addBox(-4.0F, -1.35F, -0.65F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(46, 21).addBox(-3.25F, -0.1F, -1.9F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(46, 21).mirror().addBox(1.25F, -0.1F, -1.9F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 21).mirror().addBox(1.0F, -1.35F, -0.65F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 21).addBox(-3.5F, -2.1F, -0.75F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(46, 21).mirror().addBox(0.5F, -2.1F, -0.75F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).addBox(-3.0F, -3.0F, -1.75F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(0, 0).addBox(-2.5F, -3.5F, -1.75F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(0, 0).addBox(-3.0F, 2.5F, -1.5F, 6.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, -1.45F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(2, 12).addBox(-1.5F, -0.75F, -1.75F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(2, 12).addBox(-1.5F, 0.05F, -1.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2, 12).addBox(-2.0F, -0.2F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(49, 18).addBox(-0.5F, -0.95F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
		.texOffs(2, 12).mirror().addBox(1.0F, -0.2F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, 12).mirror().addBox(0.5F, 0.05F, -1.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -1.02F, 0.25F));

		PartDefinition head_r1 = snout_upper.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(56, 11).addBox(-1.5F, -1.02F, 1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.07F, -1.7F, -1.0472F, 0.0F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.98F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(16, 14).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 17).addBox(-0.5F, -1.65F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(17, 17).addBox(0.0F, -1.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(2.0F, -2.9F, 0.75F, 0.0F, 0.0F, 0.1745F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 17).addBox(-1.0F, -1.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F))
		.texOffs(16, 17).mirror().addBox(-1.5F, -1.65F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.9F, 0.75F, 0.0F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}
