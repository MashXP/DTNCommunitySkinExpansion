package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class Moonless {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition glowing_eyes = partdefinition.addOrReplaceChild("glowing_eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 14.5F, -6.75F));

		PartDefinition real_glowing_eyes = glowing_eyes.addOrReplaceChild("real_glowing_eyes", CubeListBuilder.create().texOffs(43, 20).addBox(-0.25F, -3.2F, -2.56F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(43, 20).mirror().addBox(-2.75F, -3.2F, -2.56F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(46, 26).addBox(-3.0F, -3.0F, -2.01F, 6.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.25F, 8.0F, 1.6144F, 0.0F, 0.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.2F))
		.texOffs(9, 18).addBox(-1.0F, 2.75F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.5F))
		.texOffs(9, 18).addBox(-1.0F, 6.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.05F))
		.texOffs(9, 18).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(1, 20).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false)
		.texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(1, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.0F, -0.75F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false)
		.texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(0, 20).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -3.75F, -3.2F, 6.0F, 9.0F, 6.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_rotation_r1 = body.addOrReplaceChild("body_rotation_r1", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -2.0F, -3.25F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.25F, 0.0F, 0.0F, -3.1416F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.8F))
		.texOffs(22, 0).addBox(-4.0F, -5.9F, -3.5F, 5.0F, 6.0F, 6.0F, new CubeDeformation(-1.45F))
		.texOffs(25, 4).addBox(-4.0F, -2.75F, -4.05F, 8.0F, 5.0F, 3.0F, new CubeDeformation(-0.95F))
		.texOffs(22, 0).mirror().addBox(-1.0F, -5.9F, -3.5F, 5.0F, 6.0F, 6.0F, new CubeDeformation(-1.45F)).mirror(false), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-2.1198F, -2.3817F, -0.3767F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-3.0182F, 0.7216F, 4.4666F, 2.2271F, -0.6455F, -2.1015F));

		PartDefinition mane_rotation_r2 = upper_body.addOrReplaceChild("mane_rotation_r2", CubeListBuilder.create().texOffs(27, 5).mirror().addBox(-2.7993F, -1.5371F, -0.8392F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-0.0717F, 1.1776F, 3.3892F, -0.1838F, 0.3285F, -0.1485F));

		PartDefinition mane_rotation_r3 = upper_body.addOrReplaceChild("mane_rotation_r3", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-3.7567F, -1.4444F, 0.1284F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(28, 5).mirror().addBox(-3.4859F, -2.0513F, -0.0236F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)).mirror(false)
		.texOffs(28, 5).mirror().addBox(-3.9032F, -0.7096F, 0.3217F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(28, 5).mirror().addBox(-4.1369F, -0.053F, -0.3022F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-0.2217F, 1.1776F, 3.3892F, -0.207F, -0.5878F, -0.0612F));

		PartDefinition mane_rotation_r4 = upper_body.addOrReplaceChild("mane_rotation_r4", CubeListBuilder.create().texOffs(28, 5).addBox(0.7928F, -1.452F, 0.1514F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(-0.0717F, 1.1776F, 3.3892F, -0.207F, 0.5878F, 0.0612F));

		PartDefinition mane_rotation_r5 = upper_body.addOrReplaceChild("mane_rotation_r5", CubeListBuilder.create().texOffs(28, 5).addBox(-0.4368F, -1.5569F, -0.7392F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.0717F, 1.1776F, 3.3892F, -0.1705F, 0.0376F, 0.215F));

		PartDefinition mane_rotation_r6 = upper_body.addOrReplaceChild("mane_rotation_r6", CubeListBuilder.create().texOffs(27, 5).mirror().addBox(-1.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-1.1138F, -0.066F, 3.55F, 0.258F, 0.045F, -0.1687F));

		PartDefinition mane_rotation_r7 = upper_body.addOrReplaceChild("mane_rotation_r7", CubeListBuilder.create().texOffs(28, 5).addBox(0.7784F, -1.9958F, 0.0814F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-0.0717F, 1.1776F, 3.3892F, -0.2624F, 0.5675F, -0.0401F));

		PartDefinition mane_rotation_r8 = upper_body.addOrReplaceChild("mane_rotation_r8", CubeListBuilder.create().texOffs(28, 5).addBox(0.6F, -1.25F, 2.55F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.1308F, -0.0057F, 0.0433F));

		PartDefinition mane_rotation_r9 = upper_body.addOrReplaceChild("mane_rotation_r9", CubeListBuilder.create().texOffs(31, 5).addBox(-1.4438F, -0.9188F, -1.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(2.9119F, -1.3194F, 3.75F, 0.2147F, 0.3844F, 0.3761F));

		PartDefinition mane_rotation_r10 = upper_body.addOrReplaceChild("mane_rotation_r10", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.5783F, -0.6276F, -0.8392F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-0.2217F, 1.1776F, 3.3892F, -0.176F, -0.1289F, 0.0229F));

		PartDefinition mane_rotation_r11 = upper_body.addOrReplaceChild("mane_rotation_r11", CubeListBuilder.create().texOffs(28, 5).addBox(-1.4217F, 0.2412F, -1.4475F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.2217F, 1.1776F, 3.3892F, -0.1774F, -0.1997F, 0.1242F));

		PartDefinition mane_rotation_r12 = upper_body.addOrReplaceChild("mane_rotation_r12", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.5783F, 0.2412F, -1.4475F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-0.2217F, 1.1776F, 3.3892F, -0.175F, 0.1492F, -0.1592F));

		PartDefinition mane_rotation_r13 = upper_body.addOrReplaceChild("mane_rotation_r13", CubeListBuilder.create().texOffs(28, 5).addBox(0.7182F, -0.354F, 0.2447F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(-0.0717F, 1.1776F, 3.3892F, -0.3623F, 0.5137F, -0.2339F));

		PartDefinition mane_rotation_r14 = upper_body.addOrReplaceChild("mane_rotation_r14", CubeListBuilder.create().texOffs(28, 5).addBox(-1.3203F, -0.5447F, -0.8392F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-0.0717F, 1.1776F, 3.3892F, -0.1792F, -0.2426F, 0.1321F));

		PartDefinition mane_rotation_r15 = upper_body.addOrReplaceChild("mane_rotation_r15", CubeListBuilder.create().texOffs(29, 5).addBox(-2.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(1.1525F, -1.1572F, 3.85F, 0.1373F, -0.3084F, 0.0021F));

		PartDefinition mane_rotation_r16 = upper_body.addOrReplaceChild("mane_rotation_r16", CubeListBuilder.create().texOffs(31, 5).addBox(-1.1438F, -1.0688F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(2.9119F, -1.3194F, 3.75F, 0.1795F, 0.7601F, 0.2564F));

		PartDefinition mane_rotation_r17 = upper_body.addOrReplaceChild("mane_rotation_r17", CubeListBuilder.create().texOffs(29, 5).addBox(-1.3562F, -0.4312F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(2.9119F, -1.3194F, 3.75F, 0.1664F, 0.6742F, 0.2365F));

		PartDefinition mane_rotation_r18 = upper_body.addOrReplaceChild("mane_rotation_r18", CubeListBuilder.create().texOffs(30, 5).mirror().addBox(-0.4575F, -1.8213F, -1.4001F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(30, 5).mirror().addBox(-0.5F, -1.15F, -0.8F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -2.0F, 3.75F, 0.2637F, 0.177F, 0.183F));

		PartDefinition mane_rotation_r19 = upper_body.addOrReplaceChild("mane_rotation_r19", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-1.6907F, -0.2871F, 3.85F, 0.2738F, 0.3398F, -0.0872F));

		PartDefinition mane_rotation_r20 = upper_body.addOrReplaceChild("mane_rotation_r20", CubeListBuilder.create().texOffs(29, 5).mirror().addBox(-1.6438F, -0.4312F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(31, 5).mirror().addBox(-2.3114F, -1.9413F, -2.4008F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(31, 5).mirror().addBox(-1.1879F, -1.5553F, -1.7674F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.9119F, -1.3194F, 3.75F, 0.325F, -0.6373F, -0.3333F));

		PartDefinition mane_rotation_r21 = upper_body.addOrReplaceChild("mane_rotation_r21", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-1.8562F, -1.0688F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-2.9119F, -1.3194F, 3.75F, 0.3482F, -0.7197F, -0.3703F));

		PartDefinition mane_rotation_r22 = upper_body.addOrReplaceChild("mane_rotation_r22", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-0.3562F, -1.0688F, -0.9F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-2.9119F, -1.3194F, 3.75F, 0.263F, 0.1603F, -0.0925F));

		PartDefinition leg6_r1 = upper_body.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, -1.5381F, -1.1913F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(1, 18).addBox(5.5F, -1.5381F, -1.1913F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(-3.25F, -0.25F, -2.0F, 1.9635F, 0.0F, 0.0F));

		PartDefinition leg8_r1 = upper_body.addOrReplaceChild("leg8_r1", CubeListBuilder.create().texOffs(1, 18).mirror().addBox(-1.0F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(1, 18).addBox(5.5F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-3.25F, -1.6F, -1.0F, 1.5272F, 0.0F, 0.0F));

		PartDefinition leg4_r1 = upper_body.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(1, 18).mirror().addBox(-4.25F, -7.75F, 10.25F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(1, 18).addBox(2.25F, -7.25F, 11.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.7F))
		.texOffs(1, 18).addBox(2.25F, -7.75F, 10.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.7F))
		.texOffs(1, 18).mirror().addBox(-4.25F, -7.0F, 11.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(0, 17).addBox(1.05F, -8.25F, 9.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.9F))
		.texOffs(0, 17).mirror().addBox(-4.05F, -8.25F, 9.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.0F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leg7_r1 = upper_body.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(1, 18).mirror().addBox(-1.0F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(1, 18).addBox(5.5F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-3.25F, -0.6F, -2.0F, 1.7017F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r23 = upper_body.addOrReplaceChild("mane_rotation_r23", CubeListBuilder.create().texOffs(29, 5).mirror().addBox(-2.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-1.1525F, -1.1572F, 3.85F, 0.2865F, 0.1441F, 0.1311F));

		PartDefinition mane_rotation_r24 = upper_body.addOrReplaceChild("mane_rotation_r24", CubeListBuilder.create().texOffs(31, 5).addBox(-0.8802F, -2.3817F, -0.3767F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(3.0182F, 0.7216F, 4.4666F, 2.2271F, 0.6455F, 2.1015F));

		PartDefinition mane_rotation_r25 = upper_body.addOrReplaceChild("mane_rotation_r25", CubeListBuilder.create().texOffs(28, 5).addBox(0.7567F, -1.4444F, 0.1284F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
		.texOffs(28, 5).addBox(0.4859F, -2.0513F, -0.0236F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
		.texOffs(28, 5).addBox(0.9032F, -0.7096F, 0.3217F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
		.texOffs(28, 5).addBox(1.1369F, -0.053F, -0.3022F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.2217F, 1.1776F, 3.3892F, -0.207F, 0.5878F, 0.0612F));

		PartDefinition mane_rotation_r26 = upper_body.addOrReplaceChild("mane_rotation_r26", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-3.7928F, -1.452F, 0.1514F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(0.0717F, 1.1776F, 3.3892F, -0.207F, -0.5878F, -0.0612F));

		PartDefinition mane_rotation_r27 = upper_body.addOrReplaceChild("mane_rotation_r27", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-3.7784F, -1.9958F, 0.0814F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(0.0717F, 1.1776F, 3.3892F, -0.2624F, -0.5675F, 0.0401F));

		PartDefinition mane_rotation_r28 = upper_body.addOrReplaceChild("mane_rotation_r28", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-3.6F, -1.25F, 2.55F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.1308F, 0.0057F, -0.0433F));

		PartDefinition mane_rotation_r29 = upper_body.addOrReplaceChild("mane_rotation_r29", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-0.3562F, -1.0688F, -0.9F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-2.9119F, -1.3194F, 3.75F, 0.1312F, 0.1468F, -0.1127F));

		PartDefinition mane_rotation_r30 = upper_body.addOrReplaceChild("mane_rotation_r30", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-1.5562F, -0.9188F, -1.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(-2.9119F, -1.3194F, 3.75F, 0.2147F, -0.3844F, -0.3761F));

		PartDefinition mane_rotation_r31 = upper_body.addOrReplaceChild("mane_rotation_r31", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-1.6907F, -0.2871F, 3.85F, 0.1361F, 0.3255F, -0.1323F));

		PartDefinition mane_rotation_r32 = upper_body.addOrReplaceChild("mane_rotation_r32", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.5783F, 0.2412F, -1.4475F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-0.2217F, 1.1776F, 3.3892F, -0.1774F, 0.1997F, -0.1242F));

		PartDefinition mane_rotation_r33 = upper_body.addOrReplaceChild("mane_rotation_r33", CubeListBuilder.create().texOffs(28, 5).addBox(-0.4217F, 0.2412F, -1.4475F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.2217F, 1.1776F, 3.3892F, -0.175F, -0.1492F, 0.1592F));

		PartDefinition mane_rotation_r34 = upper_body.addOrReplaceChild("mane_rotation_r34", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-3.7182F, -0.354F, 0.2447F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(0.0717F, 1.1776F, 3.3892F, -0.3623F, -0.5137F, 0.2339F));

		PartDefinition mane_rotation_r35 = upper_body.addOrReplaceChild("mane_rotation_r35", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.6797F, -0.5447F, -0.8392F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(0.0717F, 1.1776F, 3.3892F, -0.1792F, 0.2426F, -0.1321F));

		PartDefinition mane_rotation_r36 = upper_body.addOrReplaceChild("mane_rotation_r36", CubeListBuilder.create().texOffs(29, 5).mirror().addBox(-1.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-1.1525F, -1.1572F, 3.85F, 0.1373F, 0.3084F, -0.0021F));

		PartDefinition mane_rotation_r37 = upper_body.addOrReplaceChild("mane_rotation_r37", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-1.8562F, -1.0688F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-2.9119F, -1.3194F, 3.75F, 0.1795F, -0.7601F, -0.2564F));

		PartDefinition mane_rotation_r38 = upper_body.addOrReplaceChild("mane_rotation_r38", CubeListBuilder.create().texOffs(30, 5).addBox(-3.5425F, -1.8213F, -1.4001F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(30, 5).addBox(-3.5F, -1.15F, -0.8F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(2.1F, -2.0F, 3.75F, 0.2637F, -0.177F, -0.183F));

		PartDefinition mane_rotation_r39 = upper_body.addOrReplaceChild("mane_rotation_r39", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-1.5F, -1.0F, -1.4F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-3.1679F, -0.0266F, 3.85F, 0.1504F, -0.5394F, -0.2537F));

		PartDefinition mane_rotation_r40 = upper_body.addOrReplaceChild("mane_rotation_r40", CubeListBuilder.create().texOffs(28, 5).addBox(-1.5F, -1.0F, -1.4F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(3.1679F, -0.0266F, 3.85F, 0.295F, 0.5019F, 0.3257F));

		PartDefinition mane_rotation_r41 = upper_body.addOrReplaceChild("mane_rotation_r41", CubeListBuilder.create().texOffs(28, 5).addBox(-1.5F, -0.75F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(1.6907F, -0.2871F, 3.85F, 0.2738F, -0.3398F, 0.0872F));

		PartDefinition mane_rotation_r42 = upper_body.addOrReplaceChild("mane_rotation_r42", CubeListBuilder.create().texOffs(29, 5).addBox(-1.1062F, -0.4312F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
		.texOffs(31, 5).addBox(-0.6886F, -1.9413F, -2.4008F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(31, 5).addBox(-1.8121F, -1.5553F, -1.7674F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.9119F, -1.3194F, 3.75F, 0.325F, 0.6373F, 0.3333F));

		PartDefinition mane_rotation_r43 = upper_body.addOrReplaceChild("mane_rotation_r43", CubeListBuilder.create().texOffs(29, 5).addBox(-1.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(1.1525F, -1.1572F, 3.85F, 0.2865F, -0.1441F, -0.1311F));

		PartDefinition mane_rotation_r44 = upper_body.addOrReplaceChild("mane_rotation_r44", CubeListBuilder.create().texOffs(31, 5).addBox(-1.1438F, -1.0688F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(2.9119F, -1.3194F, 3.75F, 0.3482F, 0.7197F, 0.3703F));

		PartDefinition mane_rotation_r45 = upper_body.addOrReplaceChild("mane_rotation_r45", CubeListBuilder.create().texOffs(31, 5).addBox(-2.6438F, -1.0688F, -0.9F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(2.9119F, -1.3194F, 3.75F, 0.263F, -0.1603F, 0.0925F));

		PartDefinition mane_rotation_r46 = upper_body.addOrReplaceChild("mane_rotation_r46", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-0.8899F, -1.8139F, -1.0142F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-3.1245F, -1.1347F, 0.7799F, -0.3999F, -0.6985F, 0.1282F));

		PartDefinition mane_rotation_r47 = upper_body.addOrReplaceChild("mane_rotation_r47", CubeListBuilder.create().texOffs(31, 5).addBox(-2.0857F, -2.1503F, -1.0918F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.1245F, -1.1347F, 0.7799F, -0.3999F, 0.6985F, -0.1282F));

		PartDefinition bone = upper_body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0758F, 0.4624F, 1.4968F, -0.1719F, 0.0302F, 0.1719F));

		PartDefinition mane_rotation_r48 = bone.addOrReplaceChild("mane_rotation_r48", CubeListBuilder.create().texOffs(29, 5).addBox(-0.9682F, 0.5736F, -0.706F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1984F, 0.7899F, 1.1129F));

		PartDefinition mane_rotation_r49 = bone.addOrReplaceChild("mane_rotation_r49", CubeListBuilder.create().texOffs(28, 5).addBox(-1.7861F, -0.1927F, -0.706F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2269F, 0.7081F, 1.1547F));

		PartDefinition mane_rotation_r50 = bone.addOrReplaceChild("mane_rotation_r50", CubeListBuilder.create().texOffs(28, 5).addBox(-2.147F, -0.9008F, -0.9097F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6259F, 0.6157F, 1.0993F));

		PartDefinition mane_rotation_r51 = bone.addOrReplaceChild("mane_rotation_r51", CubeListBuilder.create().texOffs(28, 5).addBox(-1.4662F, -1.1349F, -0.5521F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4117F, 0.5996F, 0.7271F));

		PartDefinition mane_rotation_r52 = bone.addOrReplaceChild("mane_rotation_r52", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.4499F, -1.816F, -0.7679F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-5.9481F, -1.4348F, -0.9834F, 0.4832F, -1.227F, 0.0208F));

		PartDefinition mane_rotation_r53 = bone.addOrReplaceChild("mane_rotation_r53", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-3.0543F, -2.4183F, -0.1202F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offsetAndRotation(-5.9481F, -1.4348F, -0.9834F, 2.0539F, -0.9575F, -1.6579F));

		PartDefinition mane_rotation_r54 = bone.addOrReplaceChild("mane_rotation_r54", CubeListBuilder.create().texOffs(30, 5).mirror().addBox(-2.8758F, -1.4212F, -0.6862F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offsetAndRotation(-5.9481F, -1.4348F, -0.9834F, 1.5151F, -1.035F, -1.0228F));

		PartDefinition mane_rotation_r55 = bone.addOrReplaceChild("mane_rotation_r55", CubeListBuilder.create().texOffs(28, 5).addBox(-0.4932F, -2.0158F, -0.6288F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.2035F, -1.4348F, -0.9834F, 0.4832F, 1.227F, -0.0208F));

		PartDefinition mane_rotation_r56 = bone.addOrReplaceChild("mane_rotation_r56", CubeListBuilder.create().texOffs(30, 5).addBox(-1.1812F, -1.6109F, -0.5337F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(-0.2035F, -1.4348F, -0.9834F, 1.5151F, 1.035F, 1.0228F));

		PartDefinition mane_rotation_r57 = bone.addOrReplaceChild("mane_rotation_r57", CubeListBuilder.create().texOffs(31, 5).addBox(-0.0514F, -2.6081F, 0.0036F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(-0.2035F, -1.4348F, -0.9834F, 2.0539F, 0.9575F, 1.6579F));

		PartDefinition mane_rotation_r58 = bone.addOrReplaceChild("mane_rotation_r58", CubeListBuilder.create().texOffs(28, 5).addBox(-1.3338F, -2.7098F, -0.0314F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(28, 5).addBox(-2.5629F, -2.2267F, -0.2928F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.456F, 0.8731F, 0.8512F));

		PartDefinition mane_rotation_r59 = bone.addOrReplaceChild("mane_rotation_r59", CubeListBuilder.create().texOffs(31, 5).addBox(-1.5921F, -2.3817F, -0.4253F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.526F, 0.66F, 0.9366F));

		PartDefinition mane_rotation_r60 = bone.addOrReplaceChild("mane_rotation_r60", CubeListBuilder.create().texOffs(29, 5).addBox(-0.9957F, -1.7441F, -0.4039F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0679F, 0.4559F, 1.8986F));

		PartDefinition mane_rotation_r61 = bone.addOrReplaceChild("mane_rotation_r61", CubeListBuilder.create().texOffs(31, 5).addBox(-1.2606F, -2.8902F, -0.0568F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F))
		.texOffs(31, 5).addBox(-1.0494F, -2.3214F, -0.2846F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9024F, 0.4016F, 1.5587F));

		PartDefinition mane_rotation_r62 = bone.addOrReplaceChild("mane_rotation_r62", CubeListBuilder.create().texOffs(28, 5).addBox(-0.5214F, -1.1436F, -0.3379F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9745F, 0.4812F, 1.7494F));

		PartDefinition mane_rotation_r63 = bone.addOrReplaceChild("mane_rotation_r63", CubeListBuilder.create().texOffs(28, 5).addBox(-0.5332F, -0.7316F, -0.5355F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
		.texOffs(28, 5).addBox(-0.4234F, 0.007F, -0.4655F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
		.texOffs(28, 5).addBox(-0.2769F, 0.7418F, -0.2722F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
		.texOffs(28, 5).addBox(-0.5076F, 1.2509F, -0.2587F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6984F, 0.6835F, 1.9084F));

		PartDefinition bone2 = upper_body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0758F, 0.4624F, 1.4968F, -0.1719F, -0.0302F, -0.1719F));

		PartDefinition mane_rotation_r64 = bone2.addOrReplaceChild("mane_rotation_r64", CubeListBuilder.create().texOffs(29, 5).mirror().addBox(-1.0318F, 0.5736F, -0.706F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1984F, -0.7899F, -1.1129F));

		PartDefinition mane_rotation_r65 = bone2.addOrReplaceChild("mane_rotation_r65", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-1.2139F, -0.1927F, -0.706F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2269F, -0.7081F, -1.1547F));

		PartDefinition mane_rotation_r66 = bone2.addOrReplaceChild("mane_rotation_r66", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-0.853F, -0.9008F, -0.9097F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6259F, -0.6157F, -1.0993F));

		PartDefinition mane_rotation_r67 = bone2.addOrReplaceChild("mane_rotation_r67", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-1.5338F, -1.1349F, -0.5521F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4117F, -0.5996F, -0.7271F));

		PartDefinition mane_rotation_r68 = bone2.addOrReplaceChild("mane_rotation_r68", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-1.7394F, -2.8902F, -0.0568F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false)
		.texOffs(31, 5).mirror().addBox(-1.9506F, -2.3214F, -0.2846F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9024F, -0.4016F, -1.5587F));

		PartDefinition mane_rotation_r69 = bone2.addOrReplaceChild("mane_rotation_r69", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-1.6662F, -2.7098F, -0.0314F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(28, 5).mirror().addBox(-1.4371F, -2.2267F, -0.2928F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.456F, -0.8731F, -0.8512F));

		PartDefinition mane_rotation_r70 = bone2.addOrReplaceChild("mane_rotation_r70", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-1.4079F, -2.3817F, -0.4253F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.526F, -0.66F, -0.9366F));

		PartDefinition mane_rotation_r71 = bone2.addOrReplaceChild("mane_rotation_r71", CubeListBuilder.create().texOffs(29, 5).mirror().addBox(-2.0043F, -1.7441F, -0.4039F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0679F, -0.4559F, -1.8986F));

		PartDefinition mane_rotation_r72 = bone2.addOrReplaceChild("mane_rotation_r72", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.4786F, -1.1436F, -0.3379F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9745F, -0.4812F, -1.7494F));

		PartDefinition mane_rotation_r73 = bone2.addOrReplaceChild("mane_rotation_r73", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.4668F, -0.7316F, -0.5355F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(28, 5).mirror().addBox(-2.5766F, 0.007F, -0.4655F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(28, 5).mirror().addBox(-2.7231F, 0.7418F, -0.2722F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6984F, -0.6835F, -1.9084F));

		PartDefinition bone3 = upper_body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0758F, 0.4624F, 1.4968F, -0.1719F, -0.0302F, -0.1719F));

		PartDefinition mane_rotation_r74 = bone3.addOrReplaceChild("mane_rotation_r74", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.4924F, 1.2509F, -0.2587F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6984F, -0.6835F, -1.9084F));

		PartDefinition bone4 = upper_body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0758F, 0.4624F, 1.4968F, -0.1719F, -0.0302F, -0.1719F));

		PartDefinition mane_rotation_r75 = bone4.addOrReplaceChild("mane_rotation_r75", CubeListBuilder.create().texOffs(31, 5).mirror().addBox(-2.9486F, -2.6081F, 0.0036F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offsetAndRotation(0.2035F, -1.4348F, -0.9834F, 2.0539F, -0.9575F, -1.6579F));

		PartDefinition bone5 = upper_body.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0758F, 0.4624F, 1.4968F, -0.1719F, -0.0302F, -0.1719F));

		PartDefinition mane_rotation_r76 = bone5.addOrReplaceChild("mane_rotation_r76", CubeListBuilder.create().texOffs(30, 5).mirror().addBox(-2.8188F, -1.6109F, -0.5337F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offsetAndRotation(0.2035F, -1.4348F, -0.9834F, 1.5151F, -1.035F, -1.0228F));

		PartDefinition bone6 = upper_body.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0758F, 0.4624F, 1.4968F, -0.1719F, -0.0302F, -0.1719F));

		PartDefinition mane_rotation_r77 = bone6.addOrReplaceChild("mane_rotation_r77", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.5068F, -2.0158F, -0.6288F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.2035F, -1.4348F, -0.9834F, 0.4832F, -1.227F, 0.0208F));

		PartDefinition bone7 = upper_body.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0758F, 0.4624F, 1.4968F, -0.1719F, -0.0302F, -0.1719F));

		PartDefinition mane_rotation_r78 = bone7.addOrReplaceChild("mane_rotation_r78", CubeListBuilder.create().texOffs(30, 5).addBox(-1.1242F, -1.4212F, -0.6862F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(5.9481F, -1.4348F, -0.9834F, 1.5151F, 1.035F, 1.0228F));

		PartDefinition bone8 = upper_body.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0758F, 0.4624F, 1.4968F, -0.1719F, -0.0302F, -0.1719F));

		PartDefinition mane_rotation_r79 = bone8.addOrReplaceChild("mane_rotation_r79", CubeListBuilder.create().texOffs(31, 5).addBox(0.0543F, -2.4183F, -0.1202F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(5.9481F, -1.4348F, -0.9834F, 2.0539F, 0.9575F, 1.6579F));

		PartDefinition bone9 = upper_body.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0758F, 0.4624F, 1.4968F, -0.1719F, -0.0302F, -0.1719F));

		PartDefinition mane_rotation_r80 = bone9.addOrReplaceChild("mane_rotation_r80", CubeListBuilder.create().texOffs(28, 5).addBox(-0.5501F, -1.816F, -0.7679F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(5.9481F, -1.4348F, -0.9834F, 0.4832F, 1.227F, -0.0208F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 14.5F, -6.75F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(-0.3F))
		.texOffs(0, 2).addBox(-2.75F, -1.25F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(-0.7F))
		.texOffs(1, 3).addBox(-2.3F, 0.25F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.8F))
		.texOffs(53, 2).addBox(1.2F, -3.3F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
		.texOffs(52, 1).mirror().addBox(-2.85F, -3.5F, -2.3F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(54, 2).mirror().addBox(-1.85F, -3.75F, -2.05F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(54, 2).mirror().addBox(-2.85F, -3.75F, -1.05F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(54, 2).mirror().addBox(-1.6F, -3.95F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(52, 9).mirror().addBox(-2.75F, -3.2F, -2.55F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(53, 2).mirror().addBox(-3.4F, -2.5F, -2.65F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(53, 2).mirror().addBox(-3.5F, -3.3F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(53, 2).mirror().addBox(-3.2F, -3.3F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(54, 2).addBox(-0.4F, -3.95F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(52, 1).addBox(-0.15F, -3.5F, -2.3F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F))
		.texOffs(54, 2).addBox(0.85F, -3.75F, -1.05F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(54, 2).addBox(-0.15F, -3.75F, -2.05F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(53, 2).addBox(1.4F, -2.5F, -2.65F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(53, 2).addBox(1.5F, -3.3F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(52, 9).addBox(-0.25F, -3.2F, -2.55F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(1, 3).mirror().addBox(-0.7F, 0.25F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.8F)).mirror(false)
		.texOffs(0, 2).mirror().addBox(-0.25F, -1.25F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, -2.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create(), PartPose.offset(0.0F, -0.52F, 0.0F));

		PartDefinition head_r1 = snout_upper.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0392F, 1.3512F, -3.1502F, 0.1796F, 0.0489F, 0.0138F));

		PartDefinition head_r2 = snout_upper.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.34F)), PartPose.offsetAndRotation(0.6392F, 1.4012F, -3.3002F, -0.6981F, 0.0F, -0.3927F));

		PartDefinition head_r3 = snout_upper.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.34F)).mirror(false), PartPose.offsetAndRotation(-0.5392F, 1.2012F, -3.4002F, -0.6981F, 0.0F, 0.3927F));

		PartDefinition head_r4 = snout_upper.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0392F, 1.2012F, -3.1502F, -0.6981F, 0.0F, -0.3927F));

		PartDefinition head_r5 = snout_upper.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1392F, 1.2012F, -3.1502F, -0.6981F, 0.0F, 0.3927F));

		PartDefinition head_r6 = snout_upper.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(38, 15).mirror().addBox(-1.25F, -1.0F, -0.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false)
		.texOffs(38, 15).addBox(-2.25F, -1.0F, -0.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F))
		.texOffs(38, 15).mirror().addBox(-1.25F, -1.5F, 1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false)
		.texOffs(38, 15).addBox(-2.25F, -1.5F, 1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(0.75F, -0.0516F, -2.6908F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r7 = snout_upper.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(38, 15).mirror().addBox(-0.75F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false)
		.texOffs(38, 15).addBox(-2.45F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(0.6F, 0.1484F, -2.6408F, 0.3316F, 0.0F, 0.0F));

		PartDefinition head_r8 = snout_upper.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0392F, 1.3512F, -3.1502F, 0.1796F, -0.0489F, -0.0138F));

		PartDefinition head_r9 = snout_upper.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2892F, 1.3512F, -3.1502F, -0.6677F, -0.2217F, 0.1208F));

		PartDefinition head_r10 = snout_upper.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.34F)).mirror(false), PartPose.offsetAndRotation(-0.6392F, 1.4012F, -3.3002F, -0.6981F, 0.0F, 0.3927F));

		PartDefinition head_r11 = snout_upper.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2892F, 1.3512F, -3.1502F, -0.6677F, 0.2217F, -0.1208F));

		PartDefinition head_r12 = snout_upper.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.34F)), PartPose.offsetAndRotation(0.5392F, 1.2012F, -3.4002F, -0.6981F, 0.0F, -0.3927F));

		PartDefinition head_r13 = snout_upper.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6392F, 1.2012F, -2.5002F, -0.3737F, -0.1313F, 0.3712F));

		PartDefinition head_r14 = snout_upper.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0392F, 1.2012F, -3.1502F, -0.6981F, 0.0F, 0.3927F));

		PartDefinition head_r15 = snout_upper.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1392F, 1.2012F, -2.7502F, 0.2618F, 0.0F, 0.3927F));

		PartDefinition head_r16 = snout_upper.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.5971F, 0.1517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6238F, -0.6252F, 0.0102F, -0.0806F, 0.4377F));

		PartDefinition head_r17 = snout_upper.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.3555F, -0.3271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6238F, -0.7252F, 0.0974F, -0.0806F, 0.4377F));

		PartDefinition head_r18 = snout_upper.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0108F, -0.8951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6238F, -0.6252F, 0.4465F, -0.0806F, 0.4377F));

		PartDefinition head_r19 = snout_upper.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.2673F, -1.5999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6238F, -0.8752F, 0.3156F, -0.0806F, 0.4377F));

		PartDefinition head_r20 = snout_upper.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3547F, 0.4914F, -1.7501F, 0.2044F, -0.255F, 1.0787F));

		PartDefinition head_r21 = snout_upper.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2892F, 1.3512F, -2.5002F, -0.3097F, -0.2494F, 0.0364F));

		PartDefinition head_r22 = snout_upper.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.2673F, -1.5999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(46, 2).mirror().addBox(-0.5F, -1.0108F, -0.8951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8738F, -1.1252F, 0.3491F, 0.0F, 0.3927F));

		PartDefinition head_r23 = snout_upper.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.3555F, -0.3271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8738F, -1.1252F, 0.1309F, 0.0F, 0.3927F));

		PartDefinition head_r24 = snout_upper.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.4202F, 0.7164F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8738F, -1.1252F, 0.1745F, 0.0F, 0.3927F));

		PartDefinition head_r25 = snout_upper.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.2585F, 1.2218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8738F, -1.1252F, 0.2182F, 0.0F, 0.3927F));

		PartDefinition head_r26 = snout_upper.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.5971F, 0.1517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8738F, -1.1252F, 0.0436F, 0.0F, 0.3927F));

		PartDefinition head_r27 = snout_upper.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.4202F, 0.7164F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6238F, -0.6252F, 0.1411F, -0.0806F, 0.4377F));

		PartDefinition head_r28 = snout_upper.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.5971F, 0.1517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.4238F, -0.3752F, 0.0102F, -0.0806F, 0.4377F));

		PartDefinition head_r29 = snout_upper.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.3555F, -0.3271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1238F, -0.4752F, 0.0974F, -0.0806F, 0.4377F));

		PartDefinition head_r30 = snout_upper.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0108F, -0.8951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.3738F, -0.4752F, 0.1411F, -0.0806F, 0.4377F));

		PartDefinition head_r31 = snout_upper.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.2673F, -1.5999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.3738F, -0.3752F, 0.3156F, -0.0806F, 0.4377F));

		PartDefinition head_r32 = snout_upper.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3217F, 1.2465F, -2.2649F, 0.2283F, -0.0806F, 0.4377F));

		PartDefinition head_r33 = snout_upper.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.2585F, 1.2218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6238F, -0.6252F, 0.1847F, -0.0806F, 0.4377F));

		PartDefinition head_r34 = snout_upper.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(56, 15).mirror().addBox(-1.7F, -2.1F, -1.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(56, 15).addBox(-0.3F, -2.1F, -1.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
		.texOffs(2, 12).addBox(-1.5F, -1.75F, -1.35F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(0, 10).addBox(-1.5F, -1.75F, -4.75F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head_r35 = snout_upper.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(38, 15).addBox(-1.25F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F))
		.texOffs(38, 15).mirror().addBox(0.65F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3484F, -3.3908F, 0.4014F, 0.0F, 0.0F));

		PartDefinition head_r36 = snout_upper.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(47, 15).addBox(-1.75F, -2.45F, -2.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(47, 15).mirror().addBox(-0.25F, -2.45F, -2.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition head_r37 = snout_upper.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(47, 15).addBox(-1.75F, -2.5F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
		.texOffs(47, 15).mirror().addBox(-0.25F, -2.5F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition head_r38 = snout_upper.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.5971F, 0.1517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.4F, 0.4238F, -0.3752F, 0.0102F, 0.0806F, -0.4377F));

		PartDefinition head_r39 = snout_upper.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.5971F, 0.1517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.4F, 0.6238F, -0.6252F, 0.0102F, 0.0806F, -0.4377F));

		PartDefinition head_r40 = snout_upper.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.2585F, 1.2218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.4F, 0.6238F, -0.6252F, 0.1847F, 0.0806F, -0.4377F));

		PartDefinition head_r41 = snout_upper.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.4202F, 0.7164F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.6238F, -0.6252F, 0.1411F, 0.0806F, -0.4377F));

		PartDefinition head_r42 = snout_upper.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.3555F, -0.3271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.1238F, -0.4752F, 0.0974F, 0.0806F, -0.4377F));

		PartDefinition head_r43 = snout_upper.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.3555F, -0.3271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.6238F, -0.7252F, 0.0974F, 0.0806F, -0.4377F));

		PartDefinition head_r44 = snout_upper.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0108F, -0.8951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.3738F, -0.4752F, 0.1411F, 0.0806F, -0.4377F));

		PartDefinition head_r45 = snout_upper.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0108F, -0.8951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.6238F, -0.6252F, 0.4465F, 0.0806F, -0.4377F));

		PartDefinition head_r46 = snout_upper.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.2673F, -1.5999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.3738F, -0.3752F, 0.3156F, 0.0806F, -0.4377F));

		PartDefinition head_r47 = snout_upper.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3547F, 0.4914F, -1.7501F, 0.2044F, 0.255F, -1.0787F));

		PartDefinition head_r48 = snout_upper.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.2673F, -1.5999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.6238F, -0.8752F, 0.3156F, 0.0806F, -0.4377F));

		PartDefinition head_r49 = snout_upper.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3217F, 1.2465F, -2.2649F, 0.2283F, 0.0806F, -0.4377F));

		PartDefinition head_r50 = snout_upper.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.2585F, 1.2218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9F, 0.8738F, -1.1252F, 0.2182F, 0.0F, -0.3927F));

		PartDefinition head_r51 = snout_upper.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.4202F, 0.7164F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.8738F, -1.1252F, 0.1745F, 0.0F, -0.3927F));

		PartDefinition head_r52 = snout_upper.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.5971F, 0.1517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9F, 0.8738F, -1.1252F, 0.0436F, 0.0F, -0.3927F));

		PartDefinition head_r53 = snout_upper.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.3555F, -0.3271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.8738F, -1.1252F, 0.1309F, 0.0F, -0.3927F));

		PartDefinition head_r54 = snout_upper.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0108F, -0.8951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(46, 2).addBox(-0.5F, -1.2673F, -1.5999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.8738F, -1.1252F, 0.3491F, 0.0F, -0.3927F));

		PartDefinition head_r55 = snout_upper.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2892F, 1.3512F, -2.5002F, -0.3097F, 0.2494F, -0.0364F));

		PartDefinition head_r56 = snout_upper.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6392F, 1.2012F, -2.5002F, -0.3737F, 0.1313F, -0.3712F));

		PartDefinition head_r57 = snout_upper.addOrReplaceChild("head_r57", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1392F, 1.2012F, -3.1502F, -0.6981F, 0.0F, -0.3927F));

		PartDefinition head_r58 = snout_upper.addOrReplaceChild("head_r58", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1392F, 1.2012F, -2.7502F, 0.2618F, 0.0F, -0.3927F));

		PartDefinition head_r59 = snout_upper.addOrReplaceChild("head_r59", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.75F, -4.75F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 0.35F, 1.75F, 0.3491F, 0.0F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
		.texOffs(0, 10).addBox(-1.5F, -0.998F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.0F, 0.63F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.0F, -2.75F, -0.5F));

		PartDefinition head_r60 = left_ear.addOrReplaceChild("head_r60", CubeListBuilder.create().texOffs(15, 13).addBox(-2.0533F, -4.4588F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.8F))
		.texOffs(15, 13).addBox(-2.0533F, -3.7088F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(0.0F, 1.3882F, 0.0F, 0.7095F, 0.8835F, 1.1069F));

		PartDefinition head_r61 = left_ear.addOrReplaceChild("head_r61", CubeListBuilder.create().texOffs(15, 13).addBox(-1.6533F, -2.9088F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 1.3882F, 0.0F, 0.4562F, 1.0049F, 0.7956F));

		PartDefinition head_r62 = left_ear.addOrReplaceChild("head_r62", CubeListBuilder.create().texOffs(15, 13).addBox(-1.6533F, -1.9088F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3882F, 0.0F, 0.3242F, 1.0382F, 0.6409F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.75F, -0.5F));

		PartDefinition head_r63 = right_ear.addOrReplaceChild("head_r63", CubeListBuilder.create().texOffs(15, 13).mirror().addBox(0.0533F, -3.7088F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false)
		.texOffs(15, 13).mirror().addBox(0.0533F, -4.4588F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.8F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3882F, 0.0F, 0.7095F, -0.8835F, -1.1069F));

		PartDefinition head_r64 = right_ear.addOrReplaceChild("head_r64", CubeListBuilder.create().texOffs(15, 13).mirror().addBox(-0.3467F, -2.9088F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3882F, 0.0F, 0.4562F, -1.0049F, -0.7956F));

		PartDefinition head_r65 = right_ear.addOrReplaceChild("head_r65", CubeListBuilder.create().texOffs(15, 13).mirror().addBox(-0.3467F, -1.9088F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3882F, 0.0F, 0.3242F, -1.0382F, -0.6409F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}
