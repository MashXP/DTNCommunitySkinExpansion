package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EeveelutionSylveon {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.0F, 8.0F, 1.6144F, 0.0F, 0.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(9, 18).mirror().addBox(-1.5F, 2.75F, -1.75F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(1.4F, 0.0F, 0.0F, 0.0801F, -0.056F, 0.2559F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(9, 18).addBox(-0.5F, 2.75F, -1.75F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.2982F, 0.056F, -0.2559F));

		PartDefinition tail_r3 = real_tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -0.75F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(0.0F, 5.5555F, 2.8464F, 1.7017F, 0.0F, 0.0F));

		PartDefinition tail_r4 = real_tail.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -2.0F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 5.5555F, 2.8464F, 1.309F, 0.0F, 0.0F));

		PartDefinition tail_r5 = real_tail.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(9, 18).addBox(0.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0F, 3.7077F, -0.6812F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail_r6 = real_tail.addOrReplaceChild("tail_r6", CubeListBuilder.create().texOffs(9, 18).addBox(0.0F, -0.5F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 3.7077F, -0.6812F, 0.5236F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(18, 23).mirror().addBox(-1.0F, -0.7F, -1.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 23).addBox(-1.0F, -0.7F, -1.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.25F, 2.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition body_rotation_r1 = body.addOrReplaceChild("body_rotation_r1", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -4.25F, -13.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.0F, -0.1962F, 10.4128F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(22, 0).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, 14.25F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(24, 2).addBox(-2.0F, -5.0F, -1.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(-1.0F, -2.0F, -0.5F, -0.8727F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.75F, -6.25F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = real_head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0946F, -2.0839F, 1.6985F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.9585F, 5.6192F, -2.588F, 0.5722F, -0.069F, -2.7483F));

		PartDefinition head_r2 = real_head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0946F, -1.7962F, 2.1566F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.9585F, 5.6192F, -2.588F, 1.5321F, -0.069F, -2.7483F));

		PartDefinition head_r3 = real_head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(53, 15).addBox(-1.4491F, -0.6496F, 1.7908F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.9585F, 5.6192F, -2.588F, 2.7473F, -0.1924F, -3.0303F));

		PartDefinition head_r4 = real_head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(44, 23).addBox(0.0043F, -1.1244F, 1.5622F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.9585F, 5.6192F, -2.588F, -2.846F, 0.1997F, 2.7082F));

		PartDefinition head_r5 = real_head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(44, 28).addBox(0.0519F, -1.7097F, 1.5077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.9585F, 5.6192F, -2.588F, -2.3383F, 0.1821F, 2.3073F));

		PartDefinition head_r6 = real_head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(44, 28).addBox(-0.6064F, -1.4831F, 1.5077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.9585F, 5.6192F, -2.588F, -2.4422F, -0.4682F, 2.9726F));

		PartDefinition head_r7 = real_head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0478F, -0.4357F, 1.7866F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.9585F, 5.6192F, -2.588F, 0.1723F, -0.158F, -2.5013F));

		PartDefinition head_r8 = real_head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0478F, 0.6316F, 2.5686F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.9585F, 5.6192F, -2.588F, -0.3077F, -0.158F, -2.5013F));

		PartDefinition head_r9 = real_head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(53, 2).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.7272F, -2.2895F, -1.9F, 0.0F, 0.0F, -2.9671F));

		PartDefinition head_r10 = real_head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(54, 25).addBox(-1.0F, -1.15F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F))
		.texOffs(54, 25).addBox(0.0F, -1.85F, -0.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(54, 25).addBox(-2.0F, -1.85F, -0.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(53, 2).addBox(-2.5F, -1.85F, -0.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.55F, -1.65F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head_r11 = real_head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0478F, 0.6316F, 2.5686F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.0415F, 5.6192F, -0.588F, 1.9628F, 0.8518F, -1.1101F));

		PartDefinition head_r12 = real_head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0478F, -0.4357F, 1.7866F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.0415F, 5.6192F, -0.588F, 2.4428F, 0.8518F, -1.1101F));

		PartDefinition head_r13 = real_head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0946F, -2.0839F, 1.6985F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.0415F, 5.6192F, -0.588F, 3.1234F, 0.9513F, -0.7188F));

		PartDefinition head_r14 = real_head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(44, 28).addBox(-0.4545F, -2.7979F, -0.1228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.6558F, 2.4727F, 14.0337F, -0.5966F, 1.1428F, 3.1091F));

		PartDefinition head_r15 = real_head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(44, 28).addBox(-0.0514F, -2.5473F, -0.1228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.6558F, 2.7227F, 14.0337F, -1.1924F, 0.3777F, 2.3251F));

		PartDefinition head_r16 = real_head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(44, 23).addBox(1.0206F, -1.7272F, -0.404F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.1981F, 2.5571F, 15.2809F, -0.6884F, 0.6841F, -2.9798F));

		PartDefinition head_r17 = real_head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(53, 15).addBox(-0.9794F, 0.6972F, -0.2316F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.7278F, 2.3074F, 14.0169F, -0.8629F, 0.6841F, -2.9798F));

		PartDefinition head_r18 = real_head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(17, 14).addBox(-1.0F, -5.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.3542F, -1.0791F, 8.9832F, -1.0587F, 0.6998F, -2.812F));

		PartDefinition head_r19 = real_head.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(17, 14).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2415F, -0.4122F, 8.8535F, -1.3641F, 0.6998F, -2.812F));

		PartDefinition head_r20 = real_head.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(17, 14).addBox(-1.0F, -2.85F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.0069F, 0.0949F, 6.6744F, -1.5386F, 0.6998F, -2.812F));

		PartDefinition head_r21 = real_head.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(17, 14).addBox(-1.0F, -2.75F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.3444F, 0.9123F, 4.857F, -1.7132F, 0.6998F, -2.812F));

		PartDefinition head_r22 = real_head.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(17, 14).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.8369F, 2.7812F, 3.4996F, -2.1097F, 0.9581F, -2.8759F));

		PartDefinition head_r23 = real_head.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(17, 14).addBox(-1.0F, -2.75F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.6492F, 4.6762F, 2.5988F, -1.1682F, 1.1206F, -1.534F));

		PartDefinition head_r24 = real_head.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(17, 14).addBox(-1.0F, -3.25F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.5794F, 7.3764F, 1.2934F, -0.8472F, 0.9513F, -0.7188F));

		PartDefinition head_r25 = real_head.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(17, 14).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.1643F, 8.5045F, 0.0042F, -1.4581F, 0.9513F, -0.7188F));

		PartDefinition head_r26 = real_head.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0946F, -1.7962F, 2.1566F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.0415F, 5.6192F, -0.588F, -2.1999F, 0.9513F, -0.7188F));

		PartDefinition head_r27 = real_head.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(53, 2).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 3.1356F, -1.5348F, -0.3491F, 0.0F, -3.1416F));

		PartDefinition head_r28 = real_head.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(54, 25).addBox(-1.0F, -0.8F, -1.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F))
		.texOffs(54, 20).addBox(0.0F, -1.5F, -1.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(54, 25).addBox(-2.0F, -1.5F, -1.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(53, 2).addBox(-2.5F, -1.5F, -1.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.25F, -2.55F, -1.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4021F, -0.7564F, 0.1309F, 0.0F, 0.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.0578F, -2.8292F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.5796F, -2.8382F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
		.texOffs(0, 10).addBox(-1.5F, -0.598F, -2.6F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.151F)), PartPose.offset(0.0F, 0.88F, 0.5F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(54, 9).addBox(0.3F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.8649F, -1.6831F, -0.4158F, 0.1836F, 0.1018F, 0.0639F));

		PartDefinition head_r29 = left_ear.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(54, 7).addBox(0.25F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition head_r30 = left_ear.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(54, 7).mirror().addBox(-0.5F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition head_r31 = left_ear.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(44, 14).addBox(-2.0F, -4.6382F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(4.15F, -0.9118F, 0.0F, 0.0F, 0.0F, -0.1833F));

		PartDefinition head_r32 = left_ear.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(43, 14).addBox(-1.55F, -6.3882F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.25F, -0.6118F, 0.0F, 0.0F, 0.0F, 0.192F));

		PartDefinition head_r33 = left_ear.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(43, 14).addBox(-2.0F, -4.6382F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 1.0882F, 0.3F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r34 = left_ear.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(54, 7).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.6417F, -3.3342F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition head_r35 = left_ear.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(54, 7).addBox(0.0F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition head_r36 = left_ear.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(44, 28).addBox(0.0F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.6667F, -5.341F, -2.4772F, -2.3383F, 0.1821F, -2.8415F));

		PartDefinition head_r37 = left_ear.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(44, 28).addBox(-1.0027F, -1.2445F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.6667F, -5.341F, -2.4772F, -2.4422F, -0.4682F, -2.1762F));

		PartDefinition head_r38 = left_ear.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(44, 23).addBox(-0.5696F, -3.1146F, 1.3296F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-4.816F, -2.5549F, -2.3223F, -2.846F, 0.1997F, -2.4405F));

		PartDefinition head_r39 = left_ear.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(53, 15).addBox(-0.8532F, -7.992F, 0.6685F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-9.8602F, -0.5175F, 0.2155F, 2.7473F, -0.1924F, -1.8958F));

		PartDefinition head_r40 = left_ear.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(17, 14).addBox(-0.8532F, -4.742F, 0.6685F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-4.6331F, -2.1946F, 1.4862F, 1.5321F, -0.069F, -1.6138F));

		PartDefinition head_r41 = left_ear.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(17, 14).addBox(-0.8532F, -1.992F, 0.6685F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.9021F, -2.3768F, -0.6935F, 0.5722F, -0.069F, -1.6138F));

		PartDefinition head_r42 = left_ear.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(17, 14).addBox(-0.7693F, -0.3023F, 0.8077F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.9021F, -2.3768F, -0.6935F, 0.1723F, -0.158F, -1.3668F));

		PartDefinition head_r43 = left_ear.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(17, 14).addBox(-0.7693F, 1.2018F, 1.7619F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.9021F, -2.3768F, -0.6935F, -0.3077F, -0.158F, -1.3668F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(54, 9).mirror().addBox(-1.3F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-0.8649F, -1.6831F, -0.4158F, 0.1836F, -0.1018F, -0.0639F));

		PartDefinition head_r44 = right_ear.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(17, 14).addBox(0.2706F, 1.0215F, 2.3163F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(7.1186F, -3.8634F, 1.0117F, -1.0162F, -0.1859F, 1.1594F));

		PartDefinition head_r45 = right_ear.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(17, 14).addBox(0.2706F, -0.2063F, 1.3827F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(7.1186F, -3.8634F, 1.0117F, -0.5362F, -0.1859F, 1.1594F));

		PartDefinition head_r46 = right_ear.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(53, 15).addBox(0.1034F, -1.4376F, 1.1143F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(7.1186F, -3.8634F, 1.0117F, -0.1065F, -0.2752F, 0.9074F));

		PartDefinition head_r47 = right_ear.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(44, 23).addBox(-1.1997F, -2.9772F, 1.7642F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(7.1186F, -3.8634F, 1.0117F, 0.3843F, 0.3562F, 0.9799F));

		PartDefinition head_r48 = right_ear.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(44, 28).addBox(-0.8758F, -3.5629F, 2.2325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.1186F, -3.8634F, 1.2617F, 0.5883F, 1.0255F, 0.6298F));

		PartDefinition head_r49 = right_ear.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(44, 28).addBox(-1.7621F, -2.762F, 2.2325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.2186F, -3.6134F, 1.3617F, 1.1027F, 0.2964F, 1.3914F));

		PartDefinition head_r50 = right_ear.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(54, 7).mirror().addBox(-1.0F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0882F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition head_r51 = right_ear.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(54, 7).mirror().addBox(-1.25F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1944F, -3.3051F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition head_r52 = right_ear.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(-0.45F, -6.3882F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.25F, -0.6118F, 0.0F, 0.0F, 0.0F, -0.192F));

		PartDefinition head_r53 = right_ear.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(-1.0F, -4.6382F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0882F, 0.3F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r54 = right_ear.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(54, 7).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.6417F, -3.3342F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition head_r55 = right_ear.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(44, 14).mirror().addBox(0.0F, -4.6382F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-4.15F, -0.9118F, 0.0F, 0.0F, 0.0F, 0.1833F));

		PartDefinition head_r56 = right_ear.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(54, 7).addBox(-0.5F, -4.6382F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0132F, -2.6204F, 0.0F, 0.0F, 0.0F, -0.0873F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}
