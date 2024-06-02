package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class Ninetales {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(45, 19).mirror().addBox(-1.4073F, -0.6257F, -2.4295F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 1.2586F, -0.9629F, 2.6655F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-3.4427F, 1.3967F, -6.9796F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.9F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.5501F, -1.0185F, 2.6776F));

		PartDefinition tail_r3 = real_tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(8, 18).mirror().addBox(-3.3502F, 5.4651F, -11.1373F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.45F)).mirror(false)
		.texOffs(8, 18).mirror().addBox(-3.4427F, 3.7983F, -11.4587F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.2F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, -3.0786F, -1.0185F, 2.6776F));

		PartDefinition tail_r4 = real_tail.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(8, 18).addBox(0.8157F, 7.2785F, -13.1864F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.3F))
		.texOffs(8, 18).addBox(1.146F, 4.7961F, -13.0513F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.8F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, -1.9061F, 0.9813F, -1.956F));

		PartDefinition tail_r5 = real_tail.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(48, 19).addBox(1.146F, 3.1578F, -7.6357F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.2F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, -2.5606F, 0.9813F, -1.956F));

		PartDefinition tail_r6 = real_tail.addOrReplaceChild("tail_r6", CubeListBuilder.create().texOffs(45, 19).addBox(0.78F, 0.5108F, -1.2763F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.8811F, 1.0909F, -1.6593F));

		PartDefinition tail_r7 = real_tail.addOrReplaceChild("tail_r7", CubeListBuilder.create().texOffs(45, 19).mirror().addBox(-2.8524F, -1.0642F, -1.9119F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.7994F, -1.0944F, 1.2971F));

		PartDefinition tail_r8 = real_tail.addOrReplaceChild("tail_r8", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-4.9615F, 1.8767F, -6.5335F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.2F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, -2.6268F, -0.974F, 1.5762F));

		PartDefinition tail_r9 = real_tail.addOrReplaceChild("tail_r9", CubeListBuilder.create().texOffs(8, 18).mirror().addBox(-4.6305F, 7.223F, -11.1634F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.5F)).mirror(false)
		.texOffs(8, 18).mirror().addBox(-4.9615F, 4.4507F, -11.397F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.0F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, -1.9723F, -0.974F, 1.5762F));

		PartDefinition tail_r10 = real_tail.addOrReplaceChild("tail_r10", CubeListBuilder.create().texOffs(1, 18).mirror().addBox(-0.4095F, -2.9204F, -3.3326F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.9F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 1.9525F, -0.6412F, 2.6787F));

		PartDefinition tail_r11 = real_tail.addOrReplaceChild("tail_r11", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-3.0656F, 1.1176F, -5.4439F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.2F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 3.0344F, -0.4571F, 2.7088F));

		PartDefinition tail_r12 = real_tail.addOrReplaceChild("tail_r12", CubeListBuilder.create().texOffs(8, 18).mirror().addBox(-3.0063F, 7.6607F, -10.1939F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.45F)).mirror(false)
		.texOffs(8, 18).mirror().addBox(-3.0656F, 4.5117F, -10.0704F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.5F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, -2.5943F, -0.4571F, 2.7088F));

		PartDefinition tail_r13 = real_tail.addOrReplaceChild("tail_r13", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-2.1742F, 0.6653F, -6.6218F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.2F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.8842F, 0.2047F, 2.9207F));

		PartDefinition tail_r14 = real_tail.addOrReplaceChild("tail_r14", CubeListBuilder.create().texOffs(8, 18).mirror().addBox(-2.2271F, 5.4439F, -11.8316F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.1F)).mirror(false)
		.texOffs(8, 18).mirror().addBox(-2.3486F, 3.8269F, -12.389F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.4F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.7946F, -0.2298F, 2.9175F));

		PartDefinition tail_r15 = real_tail.addOrReplaceChild("tail_r15", CubeListBuilder.create().texOffs(8, 18).addBox(-0.2204F, 6.2179F, -12.9261F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.9F))
		.texOffs(8, 18).addBox(0.1683F, 3.975F, -12.4178F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.4F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.9348F, 0.2571F, 2.9967F));

		PartDefinition tail_r16 = real_tail.addOrReplaceChild("tail_r16", CubeListBuilder.create().texOffs(48, 19).addBox(0.1683F, 2.0396F, -7.5452F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.3F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.324F, 0.2571F, 2.9967F));

		PartDefinition tail_r17 = real_tail.addOrReplaceChild("tail_r17", CubeListBuilder.create().texOffs(45, 19).addBox(-0.3709F, 0.6045F, -1.8227F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 0.8209F, 0.3729F, 2.793F));

		PartDefinition tail_r18 = real_tail.addOrReplaceChild("tail_r18", CubeListBuilder.create().texOffs(8, 18).addBox(1.4503F, 6.4736F, -12.3949F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.4F))
		.texOffs(8, 18).addBox(1.4473F, 4.9202F, -12.3125F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.9F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, -2.7622F, 0.5584F, -2.6254F));

		PartDefinition tail_r19 = real_tail.addOrReplaceChild("tail_r19", CubeListBuilder.create().texOffs(48, 19).addBox(1.4473F, 2.9199F, -7.081F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.3F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.7792F, 0.5584F, -2.6254F));

		PartDefinition tail_r20 = real_tail.addOrReplaceChild("tail_r20", CubeListBuilder.create().texOffs(45, 19).addBox(1.1237F, 0.6012F, -0.7577F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 1.5243F, 0.8764F, -2.531F));

		PartDefinition tail_r21 = real_tail.addOrReplaceChild("tail_r21", CubeListBuilder.create().texOffs(8, 18).addBox(0.448F, 6.728F, -10.9192F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.3F))
		.texOffs(8, 18).addBox(0.5985F, 4.6338F, -10.6335F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, -2.5258F, 0.346F, -3.1204F));

		PartDefinition tail_r22 = real_tail.addOrReplaceChild("tail_r22", CubeListBuilder.create().texOffs(48, 19).addBox(0.5985F, 1.5572F, -5.8163F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.1F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 3.1029F, 0.346F, -3.1204F));

		PartDefinition tail_r23 = real_tail.addOrReplaceChild("tail_r23", CubeListBuilder.create().texOffs(0, 18).addBox(0.6383F, -0.9005F, -1.8571F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.0232F, 0.5278F, -3.078F));

		PartDefinition tail_r24 = real_tail.addOrReplaceChild("tail_r24", CubeListBuilder.create().texOffs(8, 18).addBox(-4.1318F, 5.0213F, -11.4466F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.4F))
		.texOffs(8, 18).addBox(-3.8064F, 2.9293F, -10.8486F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.9F)), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, -2.7384F, 0.2359F, 3.0967F));

		PartDefinition tail_r25 = real_tail.addOrReplaceChild("tail_r25", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-2.3486F, 2.0738F, -7.7901F, 4.0F, 8.0F, 2.0F, new CubeDeformation(1.5F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 2.0965F, -0.2298F, 2.9175F));

		PartDefinition tail_r26 = real_tail.addOrReplaceChild("tail_r26", CubeListBuilder.create().texOffs(46, 19).mirror().addBox(-1.15F, -2.8189F, -1.2241F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 4.8289F, -1.5661F, 1.7869F, 0.0189F, 2.9242F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(20, 15).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.5F))
		.texOffs(29, 2).addBox(2.25F, -3.25F, -1.75F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F))
		.texOffs(29, 2).addBox(1.5F, -4.25F, -1.75F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.4F))
		.texOffs(30, 3).addBox(-1.0F, -4.65F, -0.75F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(29, 2).addBox(0.75F, -3.25F, -2.85F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(29, 2).addBox(0.5F, -3.45F, -3.85F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(29, 2).addBox(-0.1F, -3.45F, -2.35F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F))
		.texOffs(29, 2).addBox(-0.5F, -3.3F, -4.65F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F))
		.texOffs(21, 0).addBox(-4.0F, -0.75F, -3.25F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.85F))
		.texOffs(30, 2).addBox(-0.85F, -4.25F, -1.75F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F))
		.texOffs(30, 2).mirror().addBox(-1.8F, -4.25F, -0.55F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(29, 2).mirror().addBox(-1.5F, -3.45F, -3.55F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(29, 2).mirror().addBox(-4.25F, -3.25F, -1.75F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(29, 2).mirror().addBox(-3.5F, -4.25F, -2.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(29, 2).mirror().addBox(-2.75F, -3.25F, -2.85F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(29, 2).addBox(0.25F, -4.25F, -1.75F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(26, 3).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 5.25F, -0.9163F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r2 = upper_body.addOrReplaceChild("mane_rotation_r2", CubeListBuilder.create().texOffs(25, 2).addBox(-1.0F, -3.0F, -3.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -2.0F, 3.25F, -0.9163F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r3 = upper_body.addOrReplaceChild("mane_rotation_r3", CubeListBuilder.create().texOffs(29, 2).mirror().addBox(-1.75F, -0.5F, -1.95F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.7F, -2.8F, 0.0F, 0.0F, -1.5708F));

		PartDefinition mane_rotation_r4 = upper_body.addOrReplaceChild("mane_rotation_r4", CubeListBuilder.create().texOffs(29, 2).mirror().addBox(-1.0F, -1.5F, -1.95F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-3.3F, -1.0F, -0.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition mane_rotation_r5 = upper_body.addOrReplaceChild("mane_rotation_r5", CubeListBuilder.create().texOffs(29, 2).mirror().addBox(-0.25F, -0.5F, -3.05F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.25F, -0.55F, 0.0F, 0.0F, -1.5708F));

		PartDefinition mane_rotation_r6 = upper_body.addOrReplaceChild("mane_rotation_r6", CubeListBuilder.create().texOffs(29, 2).addBox(-1.75F, -0.5F, -3.05F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.25F, -0.55F, 0.0F, 0.0F, 1.5708F));

		PartDefinition mane_rotation_r7 = upper_body.addOrReplaceChild("mane_rotation_r7", CubeListBuilder.create().texOffs(29, 2).addBox(-1.0F, -1.5F, -1.95F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.3F, -1.0F, -0.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition mane_rotation_r8 = upper_body.addOrReplaceChild("mane_rotation_r8", CubeListBuilder.create().texOffs(29, 2).addBox(-0.25F, -0.5F, -1.95F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.0F, -1.7F, -2.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(0, 0).addBox(-3.0F, 1.2F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, -2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.9913F, -3.4338F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -0.52F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.98F, 0.0F));

		PartDefinition head_r1 = snout_lower.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2913F, -1.4338F, 0.0F, 3.1416F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.15F, -2.25F, 0.75F, 0.0F, 0.0F, -0.0873F));

		PartDefinition head_r2 = left_ear.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(0.6444F, -2.6938F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0293F, 0.2269F, -0.55F, -0.0646F, 0.4637F, -0.5001F));

		PartDefinition head_r3 = left_ear.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(15, 13).mirror().addBox(0.8646F, -3.9636F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0293F, 0.2269F, -0.55F, 0.0013F, 0.4679F, -0.3536F));

		PartDefinition head_r4 = left_ear.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(16, 14).addBox(-1.9474F, -2.9678F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0293F, 0.2269F, -0.55F, 0.37F, 0.2932F, 0.574F));

		PartDefinition head_r5 = left_ear.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(15, 13).mirror().addBox(-1.3137F, -2.381F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0293F, 0.2269F, -0.55F, 0.1354F, 0.4492F, -0.0524F));

		PartDefinition head_r6 = left_ear.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(15, 13).mirror().addBox(0.2772F, -1.9891F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(16, 14).mirror().addBox(-0.2228F, -1.9891F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.0293F, 0.2269F, -0.55F, 0.1922F, 0.4293F, 0.0808F));

		PartDefinition head_r7 = left_ear.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(15, 13).mirror().addBox(-2.3849F, -3.7502F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0293F, 0.2269F, -0.55F, 0.3725F, 0.29F, 0.5825F));

		PartDefinition head_r8 = left_ear.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(16, 14).addBox(-0.9523F, -2.0584F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0293F, 0.2269F, -0.55F, 0.1102F, 0.4556F, -0.1102F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(2.15F, -2.25F, 0.75F, 0.0F, 0.0F, 0.0873F));

		PartDefinition head_r9 = right_ear.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(15, 13).addBox(-1.2772F, -1.9891F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F))
		.texOffs(16, 14).addBox(-0.7772F, -1.9891F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.0293F, 0.2269F, -0.55F, 0.1922F, -0.4293F, -0.0808F));

		PartDefinition head_r10 = right_ear.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-0.0477F, -2.0584F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0293F, 0.2269F, -0.55F, 0.1102F, -0.4556F, 0.1102F));

		PartDefinition head_r11 = right_ear.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(15, 13).addBox(0.3137F, -2.381F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0293F, 0.2269F, -0.55F, 0.1354F, -0.4492F, 0.0524F));

		PartDefinition head_r12 = right_ear.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(0.9474F, -2.9678F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0293F, 0.2269F, -0.55F, 0.37F, -0.2932F, -0.574F));

		PartDefinition head_r13 = right_ear.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(15, 13).addBox(1.3849F, -3.7502F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0293F, 0.2269F, -0.55F, 0.3725F, -0.29F, -0.5825F));

		PartDefinition head_r14 = right_ear.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(16, 14).addBox(-1.6444F, -2.6938F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0293F, 0.2269F, -0.55F, -0.0646F, -0.4637F, 0.5001F));

		PartDefinition head_r15 = right_ear.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(15, 13).addBox(-1.8646F, -3.9636F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0293F, 0.2269F, -0.55F, 0.0013F, -0.4679F, 0.3536F));

		PartDefinition bone = real_head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(31, 5).addBox(-0.9147F, -1.1382F, -4.0882F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(33, 6).addBox(-0.9147F, -1.1382F, -5.5882F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
		.texOffs(32, 5).addBox(-0.9147F, -2.1882F, -5.0882F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(33, 6).addBox(-1.0147F, 0.1118F, -5.5882F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.15F))
		.texOffs(31, 5).addBox(-1.0147F, 0.1618F, -4.0882F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.4F))
		.texOffs(33, 7).addBox(-1.1147F, -0.0882F, 0.6618F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(33, 7).addBox(-1.1147F, -0.3382F, -1.0882F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.2F))
		.texOffs(31, 5).addBox(-1.3147F, 0.3118F, -1.5882F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(31, 5).addBox(0.0353F, 0.3118F, -2.5882F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(32, 4).addBox(-0.2147F, 1.1118F, -4.0882F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F))
		.texOffs(33, 6).addBox(-0.8647F, 0.3618F, 0.1618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(30, 4).addBox(-0.5647F, 1.5118F, -2.8382F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(32, 6).addBox(-0.5647F, 2.0618F, -1.3382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 6).addBox(-0.8647F, 2.6118F, -0.6382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(32, 6).addBox(-0.5647F, 3.2118F, -0.0882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(31, 5).addBox(-1.1147F, -2.5382F, -3.0882F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(31, 5).addBox(-1.1147F, -2.6882F, -1.0882F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F))
		.texOffs(31, 5).addBox(-0.7147F, -3.4382F, -1.8382F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F))
		.texOffs(31, 5).addBox(-0.7147F, -4.0882F, -0.8382F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.8F))
		.texOffs(31, 5).addBox(-0.9147F, -3.2382F, 0.1618F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.7F))
		.texOffs(31, 5).addBox(-1.2647F, -3.6382F, 0.1618F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.8F))
		.texOffs(30, 4).addBox(-0.9147F, -0.9382F, -0.3382F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.2647F, -4.1618F, 5.1382F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
	
}
