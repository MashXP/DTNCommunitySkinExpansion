package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EeveelutionLeafeon {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.999F, 8.0436F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(10, 21).addBox(-1.0F, -0.25F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(57, 0).addBox(-1.5F, -0.75F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3955F, 3.8932F, 7.9091F, 2.1113F, 0.9933F, -0.2047F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(57, 0).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3955F, 3.8932F, 7.9091F, 1.8584F, 0.1391F, -0.6295F));

		PartDefinition tail_r3 = real_tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(1.9333F, 5.1297F, 6.3458F, 2.027F, 0.678F, -0.4326F));

		PartDefinition tail_r4 = real_tail.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(56, 0).addBox(-1.375F, -0.625F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.1303F, 5.749F, 4.1901F, 1.5034F, 0.678F, -0.4326F));

		PartDefinition tail_r5 = real_tail.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(56, 0).addBox(-2.4385F, -1.6698F, -2.5268F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.9014F, 3.2595F, 3.797F, 1.0296F, -0.4595F, 0.2605F));

		PartDefinition tail_r6 = real_tail.addOrReplaceChild("tail_r6", CubeListBuilder.create().texOffs(56, 6).addBox(-1.2855F, 1.3423F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3089F, 1.7884F, -0.3F, 0.7109F, 0.2332F, -0.2622F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.0F, 0.75F, -1.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(0, 17).mirror().addBox(-1.0F, -0.25F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(-1.5F, 15.25F, 7.0F));

		PartDefinition leg6_r1 = right_hind_leg.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(58, 1).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.25F, 5.75F, 0.55F, -2.6616F, 0.5672F, -3.1416F));

		PartDefinition leg7_r1 = right_hind_leg.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(58, 1).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.25F, 5.75F, 0.55F, 3.0107F, 0.5672F, 3.1416F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(0, 20).addBox(-1.0F, 0.75F, -1.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.5F, 15.25F, 7.0F));

		PartDefinition leg7_r2 = left_hind_leg.addOrReplaceChild("leg7_r2", CubeListBuilder.create().texOffs(58, 1).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.25F, 5.75F, 0.55F, 3.0107F, -0.5672F, -3.1416F));

		PartDefinition leg6_r2 = left_hind_leg.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(58, 1).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.25F, 5.75F, 0.55F, -2.6616F, -0.5672F, 3.1416F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 15.5F, -4.0F));

		PartDefinition leg7_r3 = right_front_leg.addOrReplaceChild("leg7_r3", CubeListBuilder.create().texOffs(58, 1).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.25F, 5.0F, -1.0F, -0.1309F, 0.5672F, 0.0F));

		PartDefinition leg6_r3 = right_front_leg.addOrReplaceChild("leg6_r3", CubeListBuilder.create().texOffs(58, 1).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.0F, -1.0F, 0.48F, 0.5672F, 0.0F));

		PartDefinition leg6_r4 = right_front_leg.addOrReplaceChild("leg6_r4", CubeListBuilder.create().texOffs(58, 1).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 5.0F, 0.55F, -2.6616F, 0.1745F, -3.1416F));

		PartDefinition leg3_r1 = right_front_leg.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(58, 1).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 5.0F, 0.55F, 3.0107F, 0.1745F, 3.1416F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, 15.5F, -4.0F));

		PartDefinition leg6_r5 = left_front_leg.addOrReplaceChild("leg6_r5", CubeListBuilder.create().texOffs(58, 1).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.0F, 0.55F, -2.6616F, -0.1745F, 3.1416F));

		PartDefinition leg7_r4 = left_front_leg.addOrReplaceChild("leg7_r4", CubeListBuilder.create().texOffs(58, 1).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.0F, 0.55F, 3.0107F, -0.1745F, -3.1416F));

		PartDefinition leg6_r6 = left_front_leg.addOrReplaceChild("leg6_r6", CubeListBuilder.create().texOffs(58, 1).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.25F, 5.0F, -1.0F, -0.1309F, -0.5672F, 0.0F));

		PartDefinition leg5_r1 = left_front_leg.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(58, 1).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.25F, 5.0F, -1.0F, 0.48F, -0.5672F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -3.75F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(26, 3).addBox(-1.975F, -1.6338F, -3.8206F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(-0.025F, -1.6481F, 4.0249F, -0.6981F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r2 = upper_body.addOrReplaceChild("mane_rotation_r2", CubeListBuilder.create().texOffs(26, 3).addBox(-1.975F, -1.6338F, -3.8206F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.025F, -0.6981F, 3.2749F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leg6_r7 = upper_body.addOrReplaceChild("leg6_r7", CubeListBuilder.create().texOffs(57, 1).addBox(-1.0F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.25F, -2.75F, -1.25F, -1.3033F, 0.5936F, -0.5841F));

		PartDefinition leg8_r1 = upper_body.addOrReplaceChild("leg8_r1", CubeListBuilder.create().texOffs(57, 1).addBox(-0.525F, -1.7149F, -2.609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.025F, -0.6981F, 3.2749F, -2.7489F, 0.0F, 0.0F));

		PartDefinition leg7_r5 = upper_body.addOrReplaceChild("leg7_r5", CubeListBuilder.create().texOffs(57, 1).addBox(-0.525F, -0.621F, -2.0661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.025F, -0.6981F, 3.2749F, 2.7489F, 0.0F, 0.0F));

		PartDefinition leg6_r8 = upper_body.addOrReplaceChild("leg6_r8", CubeListBuilder.create().texOffs(57, 1).addBox(-0.525F, -0.1662F, -0.8381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.025F, -0.6981F, 3.2749F, 1.8762F, 0.0F, 0.0F));

		PartDefinition leg7_r6 = upper_body.addOrReplaceChild("leg7_r6", CubeListBuilder.create().texOffs(57, 1).addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.25F, -2.75F, -1.25F, -1.5708F, 0.0F, 0.8727F));

		PartDefinition leg6_r9 = upper_body.addOrReplaceChild("leg6_r9", CubeListBuilder.create().texOffs(57, 1).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -2.75F, -1.25F, -0.9599F, 0.0F, 0.8727F));

		PartDefinition leg5_r2 = upper_body.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(57, 1).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.25F, -2.75F, -1.25F, -0.9599F, 0.0F, 0.0F));

		PartDefinition leg7_r7 = upper_body.addOrReplaceChild("leg7_r7", CubeListBuilder.create().texOffs(57, 1).addBox(0.0F, 0.75F, -2.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.25F, -2.75F, -1.25F, -2.0508F, 0.0F, 0.0F));

		PartDefinition leg6_r10 = upper_body.addOrReplaceChild("leg6_r10", CubeListBuilder.create().texOffs(57, 1).addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.25F, -2.75F, -1.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, -6.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.25F, -2.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(-0.35F))
		.texOffs(27, 4).addBox(-3.0F, 1.75F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(-0.65F))
		.texOffs(33, 2).addBox(1.5F, 0.55F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.45F))
		.texOffs(33, 2).addBox(2.15F, 0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.65F))
		.texOffs(33, 2).addBox(2.65F, 0.15F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.65F))
		.texOffs(33, 2).mirror().addBox(-4.65F, 0.15F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.65F)).mirror(false)
		.texOffs(33, 2).mirror().addBox(-3.5F, 0.55F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.45F)).mirror(false)
		.texOffs(33, 2).mirror().addBox(-4.15F, 0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = real_head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-1.0F, -2.2322F, -0.6587F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -2.9871F, -0.8272F, 0.6545F, 0.0F, -0.3491F));

		PartDefinition head_r2 = real_head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-1.0F, -0.9058F, -0.7885F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -2.9871F, -0.8272F, 0.3927F, 0.0F, -0.3491F));

		PartDefinition head_r3 = real_head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-1.0F, 0.2371F, -0.6728F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -2.9871F, -0.8272F, 0.0F, 0.0F, -0.3491F));

		PartDefinition head_r4 = real_head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-1.0F, -2.9822F, -0.6587F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false)
		.texOffs(54, 18).mirror().addBox(-1.0F, -2.2322F, -0.6587F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false), PartPose.offsetAndRotation(0.25F, -2.9871F, -0.8272F, 0.6545F, 0.0F, 0.0F));

		PartDefinition head_r5 = real_head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-1.0F, -0.9058F, -0.7885F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(0.25F, -2.9871F, -0.8272F, 0.3927F, 0.0F, 0.0F));

		PartDefinition head_r6 = real_head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-1.0F, 0.4371F, -0.6728F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.25F, -2.9871F, -0.8272F, 0.0F, 0.0F, 0.0F));

		PartDefinition head_r7 = real_head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-1.0F, -2.2322F, -0.6587F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(1.25F, -2.9871F, -0.8272F, 0.6545F, 0.0F, 0.1745F));

		PartDefinition head_r8 = real_head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-1.0F, -0.9058F, -0.7885F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false), PartPose.offsetAndRotation(1.25F, -2.9871F, -0.8272F, 0.3927F, 0.0F, 0.1745F));

		PartDefinition head_r9 = real_head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-1.0F, 0.2371F, -0.6728F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.25F, -2.9871F, -0.8272F, 0.0F, 0.0F, 0.1745F));

		PartDefinition head_r10 = real_head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, -2.9822F, -0.6587F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F))
		.texOffs(54, 18).addBox(-1.0F, -2.2322F, -0.6587F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(-0.25F, -2.9871F, -0.8272F, 0.6545F, 0.0F, 0.0F));

		PartDefinition head_r11 = real_head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, 0.4371F, -0.6728F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.25F, -2.9871F, -0.8272F, 0.0F, 0.0F, 0.0F));

		PartDefinition head_r12 = real_head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, -0.9058F, -0.7885F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-0.25F, -2.9871F, -0.8272F, 0.3927F, 0.0F, 0.0F));

		PartDefinition head_r13 = real_head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, 0.2371F, -0.6728F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(1.5F, -2.9871F, -0.8272F, 0.0F, 0.0F, 0.3491F));

		PartDefinition head_r14 = real_head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, -0.9058F, -0.7885F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(1.5F, -2.9871F, -0.8272F, 0.3927F, 0.0F, 0.3491F));

		PartDefinition head_r15 = real_head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, -2.2322F, -0.6587F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(1.5F, -2.9871F, -0.8272F, 0.6545F, 0.0F, 0.3491F));

		PartDefinition head_r16 = real_head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, -2.2322F, -0.6587F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(-1.25F, -2.9871F, -0.8272F, 0.6545F, 0.0F, -0.1745F));

		PartDefinition head_r17 = real_head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, -0.9058F, -0.7885F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(-1.25F, -2.9871F, -0.8272F, 0.3927F, 0.0F, -0.1745F));

		PartDefinition head_r18 = real_head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, 0.2371F, -0.6728F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.25F, -2.9871F, -0.8272F, 0.0F, 0.0F, -0.1745F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7829F, -0.769F, 0.1745F, 0.0F, 0.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.75F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, -0.52F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.25F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
		.texOffs(0, 10).addBox(-1.5F, -0.248F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.251F)), PartPose.offset(0.0F, 0.53F, 0.3F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, 0.5F));

		PartDefinition left_ear2 = left_ear.addOrReplaceChild("left_ear2", CubeListBuilder.create().texOffs(17, 14).addBox(0.0F, -2.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.25F, -0.5F, -1.25F, 0.0F, -0.7854F, 0.6109F));

		PartDefinition head_r19 = left_ear2.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(59, 0).addBox(-0.1F, -2.1382F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition head_r20 = left_ear2.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(58, 0).addBox(0.5F, -4.3882F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r21 = left_ear2.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(59, 1).mirror().addBox(-0.15F, -3.0382F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, -0.1833F));

		PartDefinition head_r22 = left_ear2.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(59, 1).mirror().addBox(0.15F, -1.5382F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition head_r23 = left_ear2.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(59, 1).mirror().addBox(0.0F, -4.3882F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r24 = left_ear2.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(44, 14).addBox(-2.0F, -4.3882F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(4.15F, -0.9118F, 0.0F, 0.0F, 0.0F, -0.1833F));

		PartDefinition head_r25 = left_ear2.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(43, 14).addBox(-2.0F, -5.3882F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.25F, -0.6118F, 0.0F, 0.0F, 0.0F, 0.192F));

		PartDefinition head_r26 = left_ear2.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(43, 14).addBox(-2.0F, -4.3882F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r27 = left_ear2.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(17, 13).addBox(0.0F, -4.3882F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, 0.5F));

		PartDefinition right_ear2 = right_ear.addOrReplaceChild("right_ear2", CubeListBuilder.create().texOffs(17, 14).mirror().addBox(-1.0F, -2.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.25F, -0.5F, -1.25F, 0.0F, 0.7854F, -0.6109F));

		PartDefinition head_r28 = right_ear2.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.9F, -2.1382F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition head_r29 = right_ear2.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-1.5F, -4.3882F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r30 = right_ear2.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(59, 1).addBox(-0.85F, -3.0382F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, 0.1833F));

		PartDefinition head_r31 = right_ear2.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(59, 1).addBox(-1.15F, -1.5382F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition head_r32 = right_ear2.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(59, 1).addBox(-1.0F, -4.3882F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r33 = right_ear2.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(44, 14).mirror().addBox(0.0F, -4.3882F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-4.15F, -0.9118F, 0.0F, 0.0F, 0.0F, 0.1833F));

		PartDefinition head_r34 = right_ear2.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(0.0F, -5.3882F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.25F, -0.6118F, 0.0F, 0.0F, 0.0F, -0.192F));

		PartDefinition head_r35 = right_ear2.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(-1.0F, -4.3882F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r36 = right_ear2.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(17, 13).mirror().addBox(-1.0F, -4.3882F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone = real_head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-0.65F, -2.9871F, -0.8272F));

		PartDefinition head_r37 = bone.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(58, 2).addBox(0.15F, 1.1871F, -1.9228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(57, 1).addBox(-0.5F, 0.4371F, -1.9228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 2).addBox(0.5F, -0.3129F, -1.9228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(58, 2).addBox(1.25F, 0.1871F, -1.9228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 2).addBox(1.25F, -1.5629F, -1.9228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(58, 2).addBox(1.25F, -2.0629F, -1.9228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
		.texOffs(57, 2).addBox(0.0F, -3.0629F, -1.9228F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(57, 2).addBox(-0.75F, -3.0629F, -1.9228F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 2).addBox(-1.25F, -2.6629F, -1.9228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
	
}
