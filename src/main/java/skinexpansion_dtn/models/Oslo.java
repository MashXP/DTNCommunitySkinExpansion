package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class Oslo {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(9, 18).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(9, 18).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.2693F, 0.9017F, 0.9599F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -0.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -0.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 20).mirror().addBox(-1.0F, 0.0F, -0.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-1.0F, 0.0F, -0.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.95F, 3.6F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r2 = upper_body.addOrReplaceChild("mane_rotation_r2", CubeListBuilder.create().texOffs(56, 17).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.75F, -1.4F, 3.65F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r3 = upper_body.addOrReplaceChild("mane_rotation_r3", CubeListBuilder.create().texOffs(56, 17).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.5F, -1.15F, 3.85F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r4 = upper_body.addOrReplaceChild("mane_rotation_r4", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.5F, -2.15F, 3.85F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r5 = upper_body.addOrReplaceChild("mane_rotation_r5", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.95F, 3.6F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r6 = upper_body.addOrReplaceChild("mane_rotation_r6", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.75F, 2.55F, 2.85F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r7 = upper_body.addOrReplaceChild("mane_rotation_r7", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.55F, 2.95F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r8 = upper_body.addOrReplaceChild("mane_rotation_r8", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(1.75F, 1.8F, 3.6F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r9 = upper_body.addOrReplaceChild("mane_rotation_r9", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(3.5F, 0.8F, 4.1F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r10 = upper_body.addOrReplaceChild("mane_rotation_r10", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.75F, 0.8F, 4.6F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r11 = upper_body.addOrReplaceChild("mane_rotation_r11", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.05F, -2.35F, 3.35F, 0.0F, 0.0F, -1.5708F));

		PartDefinition mane_rotation_r12 = upper_body.addOrReplaceChild("mane_rotation_r12", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -2.85F, 3.7F, 0.0F, 0.0F, -1.5708F));

		PartDefinition mane_rotation_r13 = upper_body.addOrReplaceChild("mane_rotation_r13", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 18).addBox(5.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -3.75F, -1.65F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r14 = upper_body.addOrReplaceChild("mane_rotation_r14", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
		.texOffs(56, 18).addBox(3.8F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-2.15F, -3.95F, -2.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r15 = upper_body.addOrReplaceChild("mane_rotation_r15", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
		.texOffs(56, 18).addBox(2.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-1.25F, -3.65F, -2.55F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r16 = upper_body.addOrReplaceChild("mane_rotation_r16", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(56, 18).mirror().addBox(-3.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(1.25F, -3.75F, -2.55F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r17 = upper_body.addOrReplaceChild("mane_rotation_r17", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(56, 18).mirror().addBox(-4.8F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(2.15F, -3.65F, -2.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r18 = upper_body.addOrReplaceChild("mane_rotation_r18", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 18).addBox(-1.8F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 18).mirror().addBox(-5.2F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 18).mirror().addBox(-6.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -4.05F, -1.65F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r19 = upper_body.addOrReplaceChild("mane_rotation_r19", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(56, 18).addBox(2.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.25F, -3.15F, -4.55F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r20 = upper_body.addOrReplaceChild("mane_rotation_r20", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(56, 18).addBox(3.8F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.15F, -3.45F, -4.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r21 = upper_body.addOrReplaceChild("mane_rotation_r21", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(56, 18).addBox(5.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.0F, -3.25F, -3.65F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r22 = upper_body.addOrReplaceChild("mane_rotation_r22", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(56, 18).mirror().addBox(-3.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(1.25F, -3.25F, -4.55F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r23 = upper_body.addOrReplaceChild("mane_rotation_r23", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(56, 18).mirror().addBox(-4.8F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(2.15F, -3.15F, -4.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r24 = upper_body.addOrReplaceChild("mane_rotation_r24", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(56, 18).addBox(-1.8F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(56, 18).mirror().addBox(-5.2F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(56, 18).mirror().addBox(-6.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.0F, -3.55F, -3.65F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r25 = upper_body.addOrReplaceChild("mane_rotation_r25", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 1.3F, 4.35F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r26 = upper_body.addOrReplaceChild("mane_rotation_r26", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false)
		.texOffs(56, 18).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 1.8F, 3.6F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r27 = upper_body.addOrReplaceChild("mane_rotation_r27", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.75F, -2.65F, 3.6F, 0.0F, 0.0F, 1.5708F));

		PartDefinition mane_rotation_r28 = upper_body.addOrReplaceChild("mane_rotation_r28", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.55F, -2.65F, 3.35F, 0.0F, 0.0F, 1.5708F));

		PartDefinition mane_rotation_r29 = upper_body.addOrReplaceChild("mane_rotation_r29", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-4.25F, 1.8F, 1.35F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r30 = upper_body.addOrReplaceChild("mane_rotation_r30", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(56, 18).addBox(8.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-4.25F, 0.3F, 1.85F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r31 = upper_body.addOrReplaceChild("mane_rotation_r31", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-4.25F, 2.05F, 2.1F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r32 = upper_body.addOrReplaceChild("mane_rotation_r32", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.0F, -0.95F, 3.6F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r33 = upper_body.addOrReplaceChild("mane_rotation_r33", CubeListBuilder.create().texOffs(56, 17).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.75F, -1.4F, 3.65F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r34 = upper_body.addOrReplaceChild("mane_rotation_r34", CubeListBuilder.create().texOffs(56, 17).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.15F, 4.1F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r35 = upper_body.addOrReplaceChild("mane_rotation_r35", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -2.15F, 3.85F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r36 = upper_body.addOrReplaceChild("mane_rotation_r36", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.0F, -1.95F, 3.6F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r37 = upper_body.addOrReplaceChild("mane_rotation_r37", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 0.05F, 4.1F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r38 = upper_body.addOrReplaceChild("mane_rotation_r38", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
		.texOffs(56, 18).addBox(8.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-4.25F, 0.3F, 0.35F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r39 = upper_body.addOrReplaceChild("mane_rotation_r39", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false)
		.texOffs(56, 18).addBox(8.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-4.25F, 0.3F, -0.9F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r40 = upper_body.addOrReplaceChild("mane_rotation_r40", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 18).addBox(8.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.25F, -0.75F, 1.35F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r41 = upper_body.addOrReplaceChild("mane_rotation_r41", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(56, 18).addBox(8.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-4.25F, -0.75F, -0.65F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r42 = upper_body.addOrReplaceChild("mane_rotation_r42", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
		.texOffs(56, 18).addBox(8.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-4.25F, -0.75F, -1.2F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r43 = upper_body.addOrReplaceChild("mane_rotation_r43", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 2.55F, 2.85F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r44 = upper_body.addOrReplaceChild("mane_rotation_r44", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(1.0F, 2.8F, 2.85F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r45 = upper_body.addOrReplaceChild("mane_rotation_r45", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.8F, 4.1F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r46 = upper_body.addOrReplaceChild("mane_rotation_r46", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 0.8F, 4.6F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition mane_rotation_r47 = upper_body.addOrReplaceChild("mane_rotation_r47", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 18).addBox(8.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.25F, -2.0F, 1.35F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r48 = upper_body.addOrReplaceChild("mane_rotation_r48", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false)
		.texOffs(56, 18).addBox(8.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-4.25F, 1.55F, 0.1F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r49 = upper_body.addOrReplaceChild("mane_rotation_r49", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -2.35F, 3.35F, 0.0F, 0.0F, 1.5708F));

		PartDefinition mane_rotation_r50 = upper_body.addOrReplaceChild("mane_rotation_r50", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.75F, -2.85F, 3.7F, 0.0F, 0.0F, 1.5708F));

		PartDefinition mane_rotation_r51 = upper_body.addOrReplaceChild("mane_rotation_r51", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.05F, -2.8F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r52 = upper_body.addOrReplaceChild("mane_rotation_r52", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(56, 18).addBox(7.1F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.8F, -3.1F, -2.55F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r53 = upper_body.addOrReplaceChild("mane_rotation_r53", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.55F, -4.8F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r54 = upper_body.addOrReplaceChild("mane_rotation_r54", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(56, 18).addBox(6.6F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.55F, -3.0F, -0.15F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r55 = upper_body.addOrReplaceChild("mane_rotation_r55", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(56, 18).addBox(6.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.25F, -3.45F, -1.4F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r56 = upper_body.addOrReplaceChild("mane_rotation_r56", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(56, 18).addBox(8.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-4.25F, -2.0F, -2.55F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r57 = upper_body.addOrReplaceChild("mane_rotation_r57", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 18).addBox(7.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.75F, -2.75F, 1.1F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r58 = upper_body.addOrReplaceChild("mane_rotation_r58", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 18).addBox(7.6F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.05F, -2.6F, -2.05F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r59 = upper_body.addOrReplaceChild("mane_rotation_r59", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(1.75F, 1.55F, 4.35F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r60 = upper_body.addOrReplaceChild("mane_rotation_r60", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.75F, 0.05F, 4.1F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition mane_rotation_r61 = upper_body.addOrReplaceChild("mane_rotation_r61", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(4.25F, 1.55F, 1.35F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r62 = upper_body.addOrReplaceChild("mane_rotation_r62", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(4.25F, 1.55F, 2.1F, -1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r63 = upper_body.addOrReplaceChild("mane_rotation_r63", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -2.65F, 3.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition mane_rotation_r64 = upper_body.addOrReplaceChild("mane_rotation_r64", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.55F, -2.65F, 3.35F, 0.0F, 0.0F, -1.5708F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.5F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, -2.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(42, 20).addBox(-1.5F, -1.25F, -6.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.1F))
		.texOffs(49, 26).addBox(-0.5F, -1.25F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(52, 15).addBox(0.6F, 0.4F, -1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).addBox(0.6F, 0.95F, -1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(0.6F, 0.95F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(0.6F, 0.4F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).addBox(0.6F, 0.95F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(0.6F, 0.4F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).addBox(0.6F, 0.95F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(0.6F, 0.4F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).addBox(0.6F, 0.95F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(0.6F, 0.4F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).addBox(0.6F, 0.95F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(0.6F, 0.4F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).addBox(0.6F, 0.95F, -6.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(0.6F, 0.65F, -1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(0.6F, 0.65F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(0.6F, 0.65F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(0.6F, 0.65F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(0.6F, 0.65F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(0.6F, 0.65F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(0.6F, 0.65F, -6.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(0.6F, 0.4F, -6.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.65F, -6.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.4F, -6.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.4F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.65F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.4F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.65F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.4F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.65F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.4F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.65F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.4F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.65F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.95F, -6.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.95F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.95F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.95F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.95F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.95F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.95F, -1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.65F, -1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-1.6F, 0.4F, -1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(0.0F, -1.52F, 0.75F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(43, 23).addBox(-1.5F, -0.25F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.1F))
		.texOffs(36, 13).addBox(-1.5F, -0.95F, -4.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(43, 22).addBox(-1.5F, -0.498F, -4.8F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.099F)), PartPose.offsetAndRotation(0.0F, 0.98F, 0.75F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head_r1 = snout_lower.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.35F, -0.825F, -1.25F, 3.1416F, 0.0F, 0.0F));

		PartDefinition head_r2 = snout_lower.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.35F, -0.825F, -2.05F, 3.1416F, 0.0F, 0.0F));

		PartDefinition head_r3 = snout_lower.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.35F, -0.825F, -4.3F, 3.1416F, 0.0F, 0.0F));

		PartDefinition head_r4 = snout_lower.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.35F, -0.825F, -3.55F, 3.1416F, 0.0F, 0.0F));

		PartDefinition head_r5 = snout_lower.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(52, 15).mirror().addBox(-3.2F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(52, 15).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 15).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(52, 15).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.35F, -0.825F, -2.8F, 3.1416F, 0.0F, 0.0F));

		PartDefinition head_r6 = snout_lower.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(52, 12).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -0.2895F, -5.4772F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r7 = snout_lower.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(39, 16).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.55F, -4.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(16, 14).addBox(-1.4F, -2.8618F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(58, 1).addBox(0.0F, -1.8618F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 7).addBox(-1.25F, -2.1118F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 1).addBox(-0.5F, -3.1118F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 14).addBox(-0.85F, -3.8618F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offset(2.0F, -2.0F, 0.5F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(58, 1).mirror().addBox(-1.0F, -1.8618F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(53, 1).mirror().addBox(-0.5F, -3.1118F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(53, 7).mirror().addBox(0.25F, -2.1118F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 14).mirror().addBox(-0.15F, -3.8618F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(16, 14).mirror().addBox(0.4F, -2.8618F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(-2.0F, -2.0F, 0.5F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}
