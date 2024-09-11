package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EeveelutionFlareon {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone26 = real_tail.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(46, 26).addBox(-1.2559F, -0.1471F, 2.6029F, 2.0F, 2.0F, 1.0F, new CubeDeformation(1.05F))
		.texOffs(46, 25).addBox(0.9941F, -0.8971F, 1.1029F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.85F))
		.texOffs(46, 25).addBox(-1.9059F, -0.8971F, -0.1471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(1.45F))
		.texOffs(47, 26).addBox(1.2941F, -0.3971F, 0.8529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(1.05F))
		.texOffs(47, 26).addBox(-1.0059F, 1.3529F, 1.8529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(1.05F))
		.texOffs(47, 26).addBox(0.2441F, 0.3529F, -0.1471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(1.15F))
		.texOffs(47, 26).addBox(0.9941F, 0.8529F, -2.1471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(1.1F))
		.texOffs(47, 26).addBox(0.4941F, -1.3971F, -1.8971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(1.55F))
		.texOffs(47, 26).addBox(-1.0059F, 0.6029F, -3.1471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(1.45F))
		.texOffs(47, 26).addBox(-0.2559F, 1.6029F, -3.1471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(1.15F))
		.texOffs(46, 25).addBox(-1.7559F, 2.3529F, -5.6471F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.6F))
		.texOffs(46, 25).addBox(-0.5059F, 1.6029F, -5.6471F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.15F))
		.texOffs(46, 25).addBox(-0.5059F, 4.6029F, -4.8971F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(46, 25).addBox(-0.5059F, 5.3529F, -4.3971F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(46, 25).addBox(-0.5059F, 6.1029F, -3.6471F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(46, 25).addBox(-1.7559F, 0.8529F, -4.9471F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.5F))
		.texOffs(49, 26).mirror().addBox(-2.5059F, -1.3971F, -2.8971F, 2.0F, 1.0F, 2.0F, new CubeDeformation(1.1F)).mirror(false)
		.texOffs(50, 25).mirror().addBox(-1.0059F, -2.6471F, -2.1471F, 2.0F, 1.0F, 3.0F, new CubeDeformation(1.2F)).mirror(false)
		.texOffs(52, 27).mirror().addBox(0.4941F, -1.3971F, -0.1471F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.95F)).mirror(false)
		.texOffs(51, 26).mirror().addBox(0.9941F, -1.3971F, -3.1471F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.7F)).mirror(false)
		.texOffs(49, 24).addBox(-1.5059F, -1.8971F, -0.1471F, 2.0F, 1.0F, 3.0F, new CubeDeformation(1.1F))
		.texOffs(50, 25).addBox(-2.2559F, 0.3529F, -0.1471F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.85F))
		.texOffs(47, 22).addBox(-0.5059F, 0.3529F, -0.3971F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.75F)), PartPose.offsetAndRotation(0.0059F, 4.8971F, 0.1471F, 1.7017F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = bone26.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(46, 25).addBox(-1.0F, -0.25F, -0.375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-0.2559F, 3.1029F, 5.4779F, 0.0F, 3.1416F, 0.0F));

		PartDefinition mane_rotation_r2 = bone26.addOrReplaceChild("mane_rotation_r2", CubeListBuilder.create().texOffs(46, 25).addBox(-1.0F, -1.0F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2559F, 2.8529F, 5.2279F, 0.0F, 3.1416F, 0.0F));

		PartDefinition mane_rotation_r3 = bone26.addOrReplaceChild("mane_rotation_r3", CubeListBuilder.create().texOffs(46, 25).addBox(-1.0F, -0.25F, -0.375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
		.texOffs(46, 25).addBox(-1.0F, -1.0F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
		.texOffs(46, 25).addBox(-1.0F, -1.75F, -1.625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2559F, 3.8529F, 1.9779F, 0.0F, 3.1416F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, -0.25F, -2.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-1.0F, -0.25F, -2.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition bone19 = right_front_leg.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(45, 17).mirror().addBox(-0.5F, -1.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(45, 17).mirror().addBox(-1.5F, -0.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(45, 17).mirror().addBox(-1.5F, -1.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(45, 17).mirror().addBox(-0.5F, -0.2F, -1.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.35F, 0.05F, -1.5708F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition bone20 = left_front_leg.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(45, 17).addBox(-1.5F, -1.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F))
		.texOffs(45, 17).addBox(-0.5F, -0.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F))
		.texOffs(45, 17).addBox(-0.5F, -1.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
		.texOffs(45, 17).addBox(-1.5F, -0.2F, -1.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.05F, 2.35F, 0.05F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone = upper_body.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(50, 20).addBox(-2.5F, -3.5F, -3.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.45F))
		.texOffs(51, 20).addBox(-2.0F, -4.0F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.55F))
		.texOffs(51, 20).addBox(-2.0F, -4.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.75F))
		.texOffs(46, 18).addBox(4.5F, -2.25F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.7F))
		.texOffs(46, 18).addBox(4.6F, -2.25F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.8F))
		.texOffs(46, 18).addBox(4.5F, -2.25F, -4.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.8F))
		.texOffs(46, 18).addBox(4.75F, -2.25F, -3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.9F))
		.texOffs(46, 18).mirror().addBox(-2.75F, -2.25F, -3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.9F)).mirror(false)
		.texOffs(47, 15).mirror().addBox(-1.5F, -1.5F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(45, 18).addBox(1.0F, -2.25F, 1.55F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
		.texOffs(45, 18).mirror().addBox(0.75F, 0.0F, 1.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(45, 18).addBox(0.0F, -2.75F, 1.55F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(45, 18).mirror().addBox(0.0F, -1.5F, 1.55F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(47, 15).addBox(2.25F, -2.0F, -1.75F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(47, 15).addBox(1.5F, -0.75F, -2.1F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.1F))
		.texOffs(47, 17).mirror().addBox(2.5F, -4.25F, -1.75F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(0.5F, -3.65F, -0.55F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.15F)).mirror(false)
		.texOffs(50, 20).mirror().addBox(1.0F, -3.6F, -2.95F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.7F)).mirror(false)
		.texOffs(49, 19).mirror().addBox(1.0F, -5.25F, -3.2F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(49, 19).mirror().addBox(2.75F, -5.25F, -4.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(-2.5F, -2.25F, -4.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.6F)).mirror(false)
		.texOffs(47, 19).mirror().addBox(-3.0F, -0.25F, -3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.45F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(-1.75F, -3.25F, -6.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(-0.75F, -3.25F, -6.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(-1.75F, -2.25F, -6.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(-0.75F, -1.85F, -6.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false)
		.texOffs(46, 18).addBox(4.1F, -2.5F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.6F))
		.texOffs(47, 19).addBox(4.5F, -1.25F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F))
		.texOffs(47, 19).addBox(4.75F, -1.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F))
		.texOffs(47, 19).addBox(4.75F, -0.75F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F))
		.texOffs(47, 19).addBox(4.25F, -0.75F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F))
		.texOffs(47, 19).addBox(2.25F, -0.25F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.6F))
		.texOffs(47, 19).addBox(5.0F, -0.25F, -3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.45F))
		.texOffs(48, 18).addBox(-2.5F, -3.5F, -0.75F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.25F))
		.texOffs(46, 18).mirror().addBox(-2.5F, -2.25F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.6F)).mirror(false)
		.texOffs(47, 19).mirror().addBox(-0.25F, -0.25F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.6F)).mirror(false)
		.texOffs(47, 19).mirror().addBox(1.0F, 0.0F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.8F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(-2.1F, -2.5F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.6F)).mirror(false)
		.texOffs(44, 18).addBox(0.0F, -4.45F, 2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(44, 18).addBox(0.0F, -4.7F, -0.75F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.65F))
		.texOffs(47, 15).mirror().addBox(-1.25F, -2.0F, -1.75F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false)
		.texOffs(47, 19).mirror().addBox(-2.5F, -1.25F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false)
		.texOffs(47, 19).mirror().addBox(-2.25F, -0.75F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)).mirror(false)
		.texOffs(47, 19).mirror().addBox(-2.75F, -0.75F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)).mirror(false)
		.texOffs(47, 19).mirror().addBox(-2.75F, -1.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false)
		.texOffs(46, 18).addBox(4.5F, -2.25F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.6F))
		.texOffs(46, 18).addBox(1.75F, -1.85F, -6.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F))
		.texOffs(46, 18).addBox(2.75F, -2.25F, -6.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F))
		.texOffs(46, 18).addBox(1.75F, -3.25F, -6.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.05F))
		.texOffs(46, 18).addBox(2.75F, -3.25F, -6.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
		.texOffs(46, 18).addBox(4.5F, -2.25F, -4.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.6F))
		.texOffs(48, 18).addBox(-2.0F, -4.95F, -4.35F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
		.texOffs(48, 18).addBox(-0.5F, -5.2F, -4.85F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
		.texOffs(48, 18).addBox(-1.95F, -3.5F, -4.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.5F))
		.texOffs(48, 18).addBox(-0.2F, -4.0F, -4.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.6F))
		.texOffs(47, 17).addBox(-2.2F, -4.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(46, 18).mirror().addBox(-2.5F, -2.25F, -4.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.8F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(-2.6F, -2.25F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.8F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(-2.5F, -2.25F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.7F)).mirror(false)
		.texOffs(51, 20).mirror().addBox(3.0F, -4.0F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.75F)).mirror(false)
		.texOffs(51, 20).mirror().addBox(3.0F, -4.0F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)).mirror(false)
		.texOffs(50, 20).addBox(1.5F, -3.5F, -4.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.35F))
		.texOffs(50, 20).mirror().addBox(2.75F, -3.5F, -5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.45F)).mirror(false)
		.texOffs(50, 20).mirror().addBox(1.5F, -3.4F, -1.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)).mirror(false)
		.texOffs(50, 20).mirror().addBox(1.5F, -3.5F, -3.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.45F)).mirror(false)
		.texOffs(51, 20).mirror().addBox(3.0F, -4.0F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)).mirror(false)
		.texOffs(51, 20).mirror().addBox(3.0F, -4.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.65F)).mirror(false)
		.texOffs(47, 15).addBox(2.5F, -1.5F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.1F))
		.texOffs(45, 18).mirror().addBox(0.0F, -2.25F, 1.55F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(50, 20).addBox(-2.0F, -3.6F, -2.95F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.7F))
		.texOffs(49, 19).mirror().addBox(0.75F, -5.25F, -4.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false)
		.texOffs(49, 19).addBox(-1.15F, -5.25F, -3.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(46, 19).mirror().addBox(-2.25F, -1.5F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false)
		.texOffs(47, 19).addBox(2.25F, -1.5F, 1.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.4F))
		.texOffs(48, 18).mirror().addBox(1.5F, -4.95F, -5.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(48, 18).mirror().addBox(3.95F, -3.5F, -4.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.5F)).mirror(false)
		.texOffs(48, 18).mirror().addBox(2.2F, -3.75F, -4.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.6F)).mirror(false)
		.texOffs(51, 20).addBox(-2.0F, -4.0F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.65F))
		.texOffs(51, 20).addBox(-2.0F, -4.0F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.55F))
		.texOffs(48, 18).addBox(-2.5F, -3.5F, -3.75F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.55F))
		.texOffs(50, 20).addBox(-1.75F, -3.5F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.45F)), PartPose.offset(-1.5F, 0.5F, 1.75F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 12.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.25F, -2.55F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -1.15F, 0.1309F, 0.0F, 0.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.7565F, -2.7996F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -0.52F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.5392F, -3.3974F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(0, 10).addBox(-1.5F, -0.498F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offset(0.0F, 0.68F, 0.65F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -3.25F, 0.25F, 0.0F, 0.2182F, 0.2618F));

		PartDefinition head_r1 = left_ear.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(16, 14).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, -0.4022F, -0.4929F, -1.5708F, -1.2915F, 1.5708F));

		PartDefinition head_r2 = left_ear.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(16, 14).addBox(-1.0F, -3.6382F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, 1.2382F, -0.35F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition head_r3 = left_ear.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(58, 6).addBox(-0.9203F, -2.2553F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.192F, -1.0202F, 1.6285F, -1.5627F, 0.7855F, -1.6084F));

		PartDefinition head_r4 = left_ear.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(58, 6).addBox(-0.9203F, -2.2553F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.192F, -0.2202F, 0.3785F, -1.5642F, 0.5237F, -1.6108F));

		PartDefinition head_r5 = left_ear.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(16, 14).addBox(-0.9203F, -3.2553F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.192F, -0.9702F, 2.1285F, -1.5573F, 1.1346F, -1.6018F));

		PartDefinition head_r6 = left_ear.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(16, 14).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2588F, 0.4177F, 0.3008F, -1.5646F, 0.3928F, -1.6117F));

		PartDefinition head_r7 = left_ear.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(16, 14).addBox(-1.0F, -4.6382F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, -0.793F, -0.3395F, -1.5708F, -0.4363F, 1.5708F));

		PartDefinition head_r8 = left_ear.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(16, 14).addBox(-1.0F, -2.6382F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, 2.3882F, -1.0F, -1.5708F, -1.0908F, 1.5708F));

		PartDefinition head_r9 = left_ear.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(16, 14).addBox(-1.0F, -3.6382F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.0882F, -0.7F, -1.5708F, -0.9163F, 1.5708F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -3.25F, 0.25F, 0.0F, -0.2182F, -0.2618F));

		PartDefinition head_r10 = right_ear.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-1.0797F, -2.2553F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.192F, -0.2202F, 0.3785F, -1.5642F, -0.5237F, 1.6108F));

		PartDefinition head_r11 = right_ear.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-0.0797F, -3.2553F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.192F, -0.9702F, 2.1285F, -1.5573F, -1.1346F, 1.6018F));

		PartDefinition head_r12 = right_ear.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(0.0F, -3.6382F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.0882F, -0.7F, -1.5708F, 0.9163F, -1.5708F));

		PartDefinition head_r13 = right_ear.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(0.0F, -2.6382F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.3882F, -1.0F, -1.5708F, 1.0908F, -1.5708F));

		PartDefinition head_r14 = right_ear.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(0.0F, -4.6382F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.793F, -0.3395F, -1.5708F, 0.4363F, -1.5708F));

		PartDefinition head_r15 = right_ear.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2588F, 0.4177F, 0.3008F, -1.5646F, -0.3928F, 1.6117F));

		PartDefinition head_r16 = right_ear.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(0.0F, -3.6382F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.2382F, -0.35F, -1.5708F, 1.1781F, -1.5708F));

		PartDefinition head_r17 = right_ear.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-1.0797F, -2.2553F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.192F, -1.0202F, 1.6285F, -1.5627F, -0.7855F, 1.6084F));

		PartDefinition head_r18 = right_ear.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.4022F, -0.4929F, -1.5708F, 1.2915F, -1.5708F));

		PartDefinition bone2 = real_head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.5F, -2.5833F, 3.4167F));

		PartDefinition mane_rotation_r4 = bone2.addOrReplaceChild("mane_rotation_r4", CubeListBuilder.create().texOffs(45, 19).mirror().addBox(-5.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false)
		.texOffs(45, 19).mirror().addBox(-3.75F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r5 = bone2.addOrReplaceChild("mane_rotation_r5", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-5.0F, -3.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.75F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r6 = bone2.addOrReplaceChild("mane_rotation_r6", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-5.0F, -3.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false)
		.texOffs(44, 18).mirror().addBox(-4.5F, -3.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false)
		.texOffs(46, 19).mirror().addBox(-3.25F, -4.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -0.75F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r7 = bone2.addOrReplaceChild("mane_rotation_r7", CubeListBuilder.create().texOffs(46, 19).mirror().addBox(-4.0F, -4.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.6F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.5F, -1.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r8 = bone2.addOrReplaceChild("mane_rotation_r8", CubeListBuilder.create().texOffs(44, 15).mirror().addBox(-5.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.8F, 0.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r9 = bone2.addOrReplaceChild("mane_rotation_r9", CubeListBuilder.create().texOffs(45, 19).mirror().addBox(-5.0F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offsetAndRotation(1.25F, -0.2F, 1.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r10 = bone2.addOrReplaceChild("mane_rotation_r10", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-5.0F, -4.0F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -1.5F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone18 = real_head.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offset(-3.5F, -2.5833F, 3.4167F));

		PartDefinition mane_rotation_r11 = bone18.addOrReplaceChild("mane_rotation_r11", CubeListBuilder.create().texOffs(44, 15).addBox(4.0F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.25F, -2.1F, 0.75F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}
