package com.hello_there.rotp_littlefeet.client.render.entity.stand;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.pose.IModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPoseTransitionMultiple;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.hello_there.rotp_littlefeet.action.LittleFeetShrinkSlash;
import com.hello_there.rotp_littlefeet.entity.LittleFeetEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

public class LittleFeetModel extends HumanoidStandModel<LittleFeetEntity> {

    private final ModelRenderer helmet;
    private final ModelRenderer helmet_r1;
    private final ModelRenderer helmet_r2;
    private final ModelRenderer helmet_r3;
    private final ModelRenderer helmet_r4;
    private final ModelRenderer helmet_r5;
    private final ModelRenderer helmet_r6;
    private final ModelRenderer helmet_r7;
    private final ModelRenderer bone2;
    private final ModelRenderer torso_r1;
    private final ModelRenderer torso_r2;
    private final ModelRenderer torso_r3;
    private final ModelRenderer torso_r4;
    private final ModelRenderer torso_r5;
    private final ModelRenderer torso_r6;
    private final ModelRenderer torso_r7;
    private final ModelRenderer torso_r8;
    private final ModelRenderer bone;
    private final ModelRenderer torso_r9;
    private final ModelRenderer torso_r10;
    private final ModelRenderer torso_r11;
    private final ModelRenderer torso_r12;
    private final ModelRenderer torso_r13;
    private final ModelRenderer torso_r14;
    private final ModelRenderer leftArm_r1;
    private final ModelRenderer leftArm_r2;
    private final ModelRenderer leftForeArm_r1;
    private final ModelRenderer leftForeArm_r2;
    private final ModelRenderer rightArm_r1;
    private final ModelRenderer rightArm_r2;
    private final ModelRenderer rightForeArm_r1;
    private final ModelRenderer rightForeArm_r2;
    private final ModelRenderer greenassfinger;
    private final ModelRenderer rightForeArm_r3;
    private final ModelRenderer rightForeArm_r4;
    private final ModelRenderer leftLeg_r1;
    private final ModelRenderer rightLeg_r1;

    public LittleFeetModel() {
        super();

        addHumanoidBaseBoxes(null);
        texWidth = 128;
        texHeight = 128;


        head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.texOffs(0, 0).addBox(-3.25F, -4.5F, -4.45F, 2.0F, 2.0F, 1.0F, -0.25F, false);
        head.texOffs(0, 0).addBox(1.25F, -4.5F, -4.45F, 2.0F, 2.0F, 1.0F, -0.25F, false);

        helmet = new ModelRenderer(this);
        helmet.setPos(-2.8502F, -4.1833F, 0.0F);
        head.addChild(helmet);
        helmet.texOffs(64, 0).addBox(-0.1498F, -4.4085F, -4.5F, 6.0F, 7.0F, 9.0F, 0.15F, false);
        helmet.texOffs(32, 0).addBox(-1.1498F, -3.9085F, -4.0F, 8.0F, 7.5F, 8.0F, 0.26F, false);
        helmet.texOffs(25, 16).addBox(1.8502F, -0.1585F, -4.5F, 2.0F, 1.0F, 1.0F, 0.1F, false);

        helmet_r1 = new ModelRenderer(this);
        helmet_r1.setPos(-1.8498F, 0.9333F, 0.0F);
        helmet.addChild(helmet_r1);
        setRotationAngle(helmet_r1, 0.0F, 0.0F, 0.1309F);
        helmet_r1.texOffs(13, 18).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);
        helmet_r1.texOffs(23, 21).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.125F, false);

        helmet_r2 = new ModelRenderer(this);
        helmet_r2.setPos(7.5502F, 0.9333F, 0.0F);
        helmet.addChild(helmet_r2);
        setRotationAngle(helmet_r2, 0.0F, 0.0F, -0.1309F);
        helmet_r2.texOffs(13, 18).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);
        helmet_r2.texOffs(23, 21).addBox(-1.0F, 1.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.125F, true);

        helmet_r3 = new ModelRenderer(this);
        helmet_r3.setPos(0.0F, 0.0F, 0.0F);
        helmet.addChild(helmet_r3);
        setRotationAngle(helmet_r3, 0.0F, 0.0F, -0.0873F);
        helmet_r3.texOffs(69, 18).addBox(-1.664F, -0.6532F, -4.5F, 2.0F, 1.0F, 3.0F, 0.001F, true);

        helmet_r4 = new ModelRenderer(this);
        helmet_r4.setPos(0.0F, 0.0F, 0.0F);
        helmet.addChild(helmet_r4);
        setRotationAngle(helmet_r4, 0.0F, 0.0F, 0.1745F);
        helmet_r4.texOffs(44, 21).addBox(-0.3275F, -0.5885F, -4.5F, 2.5F, 1.0F, 0.0F, 0.0F, false);

        helmet_r5 = new ModelRenderer(this);
        helmet_r5.setPos(5.7004F, 0.0F, 0.0F);
        helmet.addChild(helmet_r5);
        setRotationAngle(helmet_r5, 0.0F, 0.0F, -0.1745F);
        helmet_r5.texOffs(44, 22).addBox(-2.1725F, -0.5885F, -4.5F, 2.5F, 1.0F, 0.0F, 0.0F, true);

        helmet_r6 = new ModelRenderer(this);
        helmet_r6.setPos(5.7004F, 0.0F, 0.0F);
        helmet.addChild(helmet_r6);
        setRotationAngle(helmet_r6, 0.0F, 0.0F, 0.0873F);
        helmet_r6.texOffs(58, 18).addBox(-0.336F, -0.6532F, -4.5F, 2.0F, 1.0F, 3.0F, 0.001F, false);

        helmet_r7 = new ModelRenderer(this);
        helmet_r7.setPos(6.8502F, -2.1585F, -2.25F);
        helmet.addChild(helmet_r7);
        setRotationAngle(helmet_r7, -0.3927F, 0.0F, 0.0F);
        helmet_r7.texOffs(107, 75).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        helmet_r7.texOffs(109, 73).addBox(-8.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setPos(0.0F, -0.75F, -3.1F);
        head.addChild(bone2);
        bone2.texOffs(0, 21).addBox(-2.5F, -1.3F, -1.175F, 5.0F, 2.0F, 1.0F, -0.25F, false);
        bone2.texOffs(0, 16).addBox(-3.0F, -1.5F, -1.5F, 6.0F, 3.0F, 2.0F, -0.4F, false);

        torso.texOffs(0, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        torso.texOffs(10, 57).addBox(-4.0F, 7.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.125F, false);
        torso.texOffs(24, 74).addBox(-2.0F, 10.1F, -2.6F, 4.0F, 2.0F, 5.0F, 0.0F, false);
        torso.texOffs(24, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.25F, false);

        torso_r1 = new ModelRenderer(this);
        torso_r1.setPos(0.0109F, 2.6002F, 2.1755F);
        torso.addChild(torso_r1);
        setRotationAngle(torso_r1, 0.0854F, 0.0472F, -0.0397F);
        torso_r1.texOffs(0, 59).addBox(0.0353F, -1.9114F, -0.4115F, 4.0F, 4.0F, 1.0F, 0.0F, true);

        torso_r2 = new ModelRenderer(this);
        torso_r2.setPos(0.0109F, 2.6002F, 2.1755F);
        torso.addChild(torso_r2);
        setRotationAngle(torso_r2, 0.0854F, -0.0472F, 0.0397F);
        torso_r2.texOffs(0, 54).addBox(-4.0352F, -1.9109F, -0.4106F, 4.0F, 4.0F, 1.0F, 0.0F, false);

        torso_r3 = new ModelRenderer(this);
        torso_r3.setPos(2.5F, 11.0F, 0.0F);
        torso.addChild(torso_r3);
        setRotationAngle(torso_r3, 0.0F, 0.0F, -0.1309F);
        torso_r3.texOffs(48, 66).addBox(-1.0F, -1.5F, -2.5F, 3.0F, 2.0F, 5.0F, 0.0F, true);

        torso_r4 = new ModelRenderer(this);
        torso_r4.setPos(-2.5F, 11.0F, 0.0F);
        torso.addChild(torso_r4);
        setRotationAngle(torso_r4, 0.0F, 0.0F, 0.1309F);
        torso_r4.texOffs(48, 66).addBox(-2.0F, -1.5F, -2.5F, 3.0F, 2.0F, 5.0F, 0.0F, false);

        torso_r5 = new ModelRenderer(this);
        torso_r5.setPos(-1.75F, 10.6F, 2.15F);
        torso.addChild(torso_r5);
        setRotationAngle(torso_r5, 0.0F, 0.0F, 0.3927F);
        torso_r5.texOffs(103, 75).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        torso_r6 = new ModelRenderer(this);
        torso_r6.setPos(1.75F, 10.6F, 2.15F);
        torso.addChild(torso_r6);
        setRotationAngle(torso_r6, 0.0F, 0.0F, 2.7489F);
        torso_r6.texOffs(106, 73).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        torso_r7 = new ModelRenderer(this);
        torso_r7.setPos(1.75F, 11.1F, -2.35F);
        torso.addChild(torso_r7);
        setRotationAngle(torso_r7, 0.0F, 0.0F, 0.3927F);
        torso_r7.texOffs(105, 75).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        torso_r8 = new ModelRenderer(this);
        torso_r8.setPos(-1.75F, 11.1F, -2.35F);
        torso.addChild(torso_r8);
        setRotationAngle(torso_r8, 0.0F, 0.0F, -0.3927F);
        torso_r8.texOffs(105, 73).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setPos(0.0F, 2.6751F, -2.6565F);
        torso.addChild(bone);


        torso_r9 = new ModelRenderer(this);
        torso_r9.setPos(0.0F, 2.0749F, 0.2565F);
        bone.addChild(torso_r9);
        setRotationAngle(torso_r9, 0.0873F, 0.0F, 0.0F);
        torso_r9.texOffs(42, 76).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);

        torso_r10 = new ModelRenderer(this);
        torso_r10.setPos(2.0F, -0.8251F, 0.0565F);
        bone.addChild(torso_r10);
        setRotationAngle(torso_r10, -0.0057F, -0.1308F, -0.2178F);
        torso_r10.texOffs(106, 75).addBox(1.25F, -1.0F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        torso_r11 = new ModelRenderer(this);
        torso_r11.setPos(-2.0F, -0.8251F, 0.0565F);
        bone.addChild(torso_r11);
        setRotationAngle(torso_r11, -0.0057F, 0.1308F, 0.2178F);
        torso_r11.texOffs(105, 73).addBox(-2.25F, -1.0F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        torso_r12 = new ModelRenderer(this);
        torso_r12.setPos(-2.0F, -0.8251F, 0.0565F);
        bone.addChild(torso_r12);
        setRotationAngle(torso_r12, -0.0057F, 0.1308F, 0.2178F);
        torso_r12.texOffs(52, 74).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);

        torso_r13 = new ModelRenderer(this);
        torso_r13.setPos(0.0F, 0.5749F, -0.3435F);
        bone.addChild(torso_r13);
        setRotationAngle(torso_r13, 0.0262F, 0.0F, 0.0F);
        torso_r13.texOffs(62, 74).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        torso_r14 = new ModelRenderer(this);
        torso_r14.setPos(2.0F, -0.8251F, 0.0565F);
        bone.addChild(torso_r14);
        setRotationAngle(torso_r14, -0.0057F, -0.1308F, -0.2178F);
        torso_r14.texOffs(52, 78).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, 0.0F, true);

        leftArm.texOffs(32, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftArm.texOffs(48, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.125F, false);
        leftArm.texOffs(79, 58).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.25F, false);

        leftArm_r1 = new ModelRenderer(this);
        leftArm_r1.setPos(2.1082F, -1.2369F, 0.0F);
        leftArm.addChild(leftArm_r1);
        setRotationAngle(leftArm_r1, 0.0F, 0.0F, -0.3491F);
        leftArm_r1.texOffs(95, 68).addBox(-0.25F, -1.525F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
        leftArm_r1.texOffs(84, 69).addBox(-0.75F, -1.525F, -2.0F, 1.0F, 3.0F, 4.0F, 0.24F, false);

        leftArm_r2 = new ModelRenderer(this);
        leftArm_r2.setPos(-0.25F, -1.25F, 0.0F);
        leftArm.addChild(leftArm_r2);
        setRotationAngle(leftArm_r2, 0.0F, 0.0F, -0.1745F);
        leftArm_r2.texOffs(83, 63).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.25F, false);

        leftArmJoint.texOffs(32, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

        leftForeArm.texOffs(32, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, true);
        leftForeArm.texOffs(48, 123).addBox(-2.0F, 2.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.125F, true);
        leftForeArm.texOffs(83, 76).addBox(-2.0F, 0.475F, -2.0F, 4.0F, 1.0F, 4.0F, 0.24F, false);
        leftForeArm.texOffs(42, 97).addBox(1.5F, 5.1F, -2.0F, 1.0F, 1.0F, 4.0F, -0.2F, true);

        leftForeArm_r1 = new ModelRenderer(this);
        leftForeArm_r1.setPos(2.05F, 4.1F, 0.0F);
        leftForeArm.addChild(leftForeArm_r1);
        setRotationAngle(leftForeArm_r1, 0.7854F, 0.0F, 0.0F);
        leftForeArm_r1.texOffs(10, 80).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, -0.65F, true);

        leftForeArm_r2 = new ModelRenderer(this);
        leftForeArm_r2.setPos(2.05F, 4.1F, 0.0F);
        leftForeArm.addChild(leftForeArm_r2);
        setRotationAngle(leftForeArm_r2, 0.7854F, 0.0F, 0.0F);
        leftForeArm_r2.texOffs(0, 80).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, -0.75F, true);

        rightArm.texOffs(0, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        rightArm.texOffs(16, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.125F, false);
        rightArm.texOffs(79, 58).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.25F, true);

        rightArm_r1 = new ModelRenderer(this);
        rightArm_r1.setPos(-2.1082F, -1.2369F, 0.0F);
        rightArm.addChild(rightArm_r1);
        setRotationAngle(rightArm_r1, 0.0F, 0.0F, 0.3491F);
        rightArm_r1.texOffs(95, 68).addBox(-0.75F, -1.525F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, true);
        rightArm_r1.texOffs(84, 69).addBox(-0.25F, -1.525F, -2.0F, 1.0F, 3.0F, 4.0F, 0.24F, true);

        rightArm_r2 = new ModelRenderer(this);
        rightArm_r2.setPos(0.25F, -1.25F, 0.0F);
        rightArm.addChild(rightArm_r2);
        setRotationAngle(rightArm_r2, 0.0F, 0.0F, 0.1745F);
        rightArm_r2.texOffs(83, 63).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.25F, true);

        rightArmJoint.texOffs(0, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

        rightForeArm.texOffs(83, 76).addBox(-2.0F, 0.475F, -2.0F, 4.0F, 1.0F, 4.0F, 0.24F, true);
        rightForeArm.texOffs(0, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        rightForeArm.texOffs(16, 123).addBox(-2.0F, 2.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.125F, false);
        rightForeArm.texOffs(10, 97).addBox(-2.5F, 5.1F, -2.0F, 1.0F, 1.0F, 4.0F, -0.2F, false);

        rightForeArm_r1 = new ModelRenderer(this);
        rightForeArm_r1.setPos(-2.05F, 4.1F, 0.0F);
        rightForeArm.addChild(rightForeArm_r1);
        setRotationAngle(rightForeArm_r1, 0.7854F, 0.0F, 0.0F);
        rightForeArm_r1.texOffs(10, 80).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, -0.65F, false);

        rightForeArm_r2 = new ModelRenderer(this);
        rightForeArm_r2.setPos(-2.05F, 4.1F, 0.0F);
        rightForeArm.addChild(rightForeArm_r2);
        setRotationAngle(rightForeArm_r2, 0.7418F, 0.0F, 0.0F);
        rightForeArm_r2.texOffs(0, 80).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, -0.75F, false);

        greenassfinger = new ModelRenderer(this);
        greenassfinger.setPos(-1.1197F, 5.9898F, -1.5F);
        rightForeArm.addChild(greenassfinger);


        rightForeArm_r3 = new ModelRenderer(this);
        rightForeArm_r3.setPos(0.0F, 0.0F, 0.0F);
        greenassfinger.addChild(rightForeArm_r3);
        setRotationAngle(rightForeArm_r3, 0.0F, 0.0F, -0.3927F);
        rightForeArm_r3.texOffs(12, 119).addBox(-1.2884F, 1.3528F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);

        rightForeArm_r4 = new ModelRenderer(this);
        rightForeArm_r4.setPos(-0.3803F, -0.0398F, 0.0F);
        greenassfinger.addChild(rightForeArm_r4);
        setRotationAngle(rightForeArm_r4, 0.0F, 0.0F, -0.1309F);
        rightForeArm_r4.texOffs(0, 119).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, -0.101F, false);

        leftLeg.texOffs(112, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.125F, false);
        leftLeg.texOffs(96, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftLeg.texOffs(96, 90).addBox(-2.0F, 0.25F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);

        leftLeg_r1 = new ModelRenderer(this);
        leftLeg_r1.setPos(1.5682F, -0.7625F, 0.0F);
        leftLeg.addChild(leftLeg_r1);
        setRotationAngle(leftLeg_r1, 0.0F, 0.0F, 0.0873F);
        leftLeg_r1.texOffs(66, 85).addBox(-1.5F, -0.325F, -2.0F, 2.0F, 1.0F, 4.0F, 0.26F, true);

        leftLegJoint.texOffs(96, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

        leftLowerLeg.texOffs(112, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.125F, false);
        leftLowerLeg.texOffs(96, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        leftLowerLeg.texOffs(112, 98).addBox(-2.0F, 1.25F, -2.0F, 4.0F, 3.0F, 4.0F, 0.25F, false);

        rightLeg.texOffs(80, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.125F, false);
        rightLeg.texOffs(64, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        rightLeg.texOffs(64, 90).addBox(-2.0F, 0.25F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);

        rightLeg_r1 = new ModelRenderer(this);
        rightLeg_r1.setPos(-1.5682F, -0.7625F, 0.0F);
        rightLeg.addChild(rightLeg_r1);
        setRotationAngle(rightLeg_r1, 0.0F, 0.0F, -0.0873F);
        rightLeg_r1.texOffs(66, 85).addBox(-0.5F, -0.325F, -2.0F, 2.0F, 1.0F, 4.0F, 0.26F, false);

        rightLegJoint.texOffs(64, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

        rightLowerLeg.texOffs(80, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.125F, false);
        rightLowerLeg.texOffs(64, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        rightLowerLeg.texOffs(80, 98).addBox(-2.0F, 1.25F, -2.0F, 4.0F, 3.0F, 4.0F, 0.25F, false);


    }

    @Override // TODO summon poses
    protected RotationAngle[][] initSummonPoseRotations() {
        return new RotationAngle[][] {
            new RotationAngle[] {
                    RotationAngle.fromDegrees(head, 17.1113, -21.1923F, -10.3766),
                    RotationAngle.fromDegrees(body, 0.0F, 0.0F, 0.0F),
                    RotationAngle.fromDegrees(upperPart, 0.0F, -35, 0.0F),
                    RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                    RotationAngle.fromDegrees(leftArm, -44.4058, 64.1524, -51.5101),
                    RotationAngle.fromDegrees(leftForeArm, -51.3482, 23.0357, -30.4473),
                    RotationAngle.fromDegrees(rightArm, 10, -40, 22.5),
                    RotationAngle.fromDegrees(rightForeArm, -55, 0.0F, 0.0F),
                    RotationAngle.fromDegrees(leftLeg, -91.1254, -49.5295, 4.1953),
                    RotationAngle.fromDegrees(leftLowerLeg, 90, 0.0F, 0.0F),
                    RotationAngle.fromDegrees(rightLeg, -89.7077, 35.0172, -7.4082),
                    RotationAngle.fromDegrees(rightLowerLeg, 92.5, 0.0F, 0.0F)
            },
            new RotationAngle[] {
                    RotationAngle.fromDegrees(head, -25, 0.0F, 0.0F),
                    RotationAngle.fromDegrees(body, 0.0F, 0.0F, 0.0F),
                    RotationAngle.fromDegrees(upperPart, 0.0F, 0.0F, 0.0F),
                    RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                    RotationAngle.fromDegrees(leftArm, -13.1162, -31.3449, -31.0811),
                    RotationAngle.fromDegrees(leftForeArm, -66.9134, -27.0681, 46.871),
                    RotationAngle.fromDegrees(rightArm, -14.8011, 41.9716, 20.978),
                    RotationAngle.fromDegrees(rightForeArm, -83.5336, 7.6443, -49.5675),
                    RotationAngle.fromDegrees(leftLeg, 0.0F, 0.0F, -15),
                    RotationAngle.fromDegrees(leftLowerLeg, 65, 0.0F, 0.0F),
                    RotationAngle.fromDegrees(rightLeg, 10.8232, 13.3097, 15.1704),
                    RotationAngle.fromDegrees(rightLowerLeg, 50, 0.0F, 0.0F)
            }
		};
    }
    
    @Override
    protected void initActionPoses() {
        ModelPose<LittleFeetEntity> slash0 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(body, 0F, 0F, 0F),
                RotationAngle.fromDegrees(upperPart, 0F, 0F, 0F),
                RotationAngle.fromDegrees(rightArm, 0F, 0F, 32.5),
                RotationAngle.fromDegrees(rightForeArm, 0F, 0F, -62.5),
                RotationAngle.fromDegrees(leftArm, 0F, -17.5, 0),
                RotationAngle.fromDegrees(leftForeArm, 0F, -90, 0F),
                RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(rightLeg, -27.2989, 3.4553, 6.6607),
                RotationAngle.fromDegrees(rightLowerLeg, 40, 0F, 0F),
                RotationAngle.fromDegrees(leftLeg, -7.3242, -1.6189, -12.3964),
                RotationAngle.fromDegrees(leftLowerLeg, 37.5, 0F, 0F)
        });
        ModelPose<LittleFeetEntity> slash1 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(body, 0F, 45, 0F),
                RotationAngle.fromDegrees(upperPart, 0F, 0F, 0F),
                RotationAngle.fromDegrees(rightArm, 0F, 0F, 52.5),
                RotationAngle.fromDegrees(rightForeArm, -18.4474, 60.8721, 69.0997),
                RotationAngle.fromDegrees(leftArm, 37.0662, -26.9462, -18.896),
                RotationAngle.fromDegrees(leftForeArm, -63.2187, -20.2935, 80.0707),
                RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(rightLeg, -27.2989, 3.4553, 6.6607),
                RotationAngle.fromDegrees(rightLowerLeg, 40, 0F, 0F),
                RotationAngle.fromDegrees(leftLeg, -7.3242, -1.6189, -12.3964),
                RotationAngle.fromDegrees(leftLowerLeg, 37.5, 0F, 0F)
        });
        ModelPose<LittleFeetEntity> slash2 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(body, 0F, -35, 0F),
                RotationAngle.fromDegrees(upperPart, 0F, 0F, 0F),
                RotationAngle.fromDegrees(rightArm, -66.638, -2.9343, 70.2304),
                RotationAngle.fromDegrees(rightForeArm, -62.1392, -8.8604, -4.6547),
                RotationAngle.fromDegrees(leftArm, 37.0662, -26.9462, -18.896),
                RotationAngle.fromDegrees(leftForeArm, -63.2187, -20.2935, 80.0707),
                RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(rightLeg, -27.2989, 3.4553, 6.6607),
                RotationAngle.fromDegrees(rightLowerLeg, 40, 0F, 0F),
                RotationAngle.fromDegrees(leftLeg, -7.3242, -1.6189, -12.3964),
                RotationAngle.fromDegrees(leftLowerLeg, 37.5, 0F, 0F)
        });

        actionAnim.put(LittleFeetShrinkSlash.SHRINK, new PosedActionAnimation.Builder<LittleFeetEntity>()
                .addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransitionMultiple.Builder<>(idlePose)
                        .addPose(0.0F, slash0)
                        .addPose(0.8F, slash1)

                        .build(slash2))
                .addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(slash2)
                        .addPose(0.9F, slash2)
                        .build(idlePose))
                .build(idlePose));

        ModelPose<LittleFeetEntity> heavyslash0 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(body, 0, 0, 0),
                RotationAngle.fromDegrees(upperPart, 0, 0, 0),
                RotationAngle.fromDegrees(rightArm, -90, 0, 0),
                RotationAngle.fromDegrees(rightForeArm, 0, 0, 0),
                RotationAngle.fromDegrees(leftArm, -35, 0, 0),
                RotationAngle.fromDegrees(leftForeArm, -94.353, -54.9222, 93.5646),
                RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(rightLeg, 0, 0, 10),
                RotationAngle.fromDegrees(rightLowerLeg, 32.5, 0, 0),
                RotationAngle.fromDegrees(leftLeg, -5.3903, 3.7317, -11.9384),
                RotationAngle.fromDegrees(leftLowerLeg, 30, 0, 0)
        });
        ModelPose<LittleFeetEntity> heavyslash1 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(body, 0, 47.5, 0),
                RotationAngle.fromDegrees(upperPart, 0, 0, 0),
                RotationAngle.fromDegrees(rightArm, -90, 85, 0),
                RotationAngle.fromDegrees(rightForeArm, 0, 0, -105),
                RotationAngle.fromDegrees(leftArm, -35, 0, 0),
                RotationAngle.fromDegrees(leftForeArm, -92.5024, -2.4976, 90.1091),
                RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(rightLeg, 0, 0, 10),
                RotationAngle.fromDegrees(rightLowerLeg, 32.5, 0, 0),
                RotationAngle.fromDegrees(leftLeg, -5.3903, 3.7317, -11.9384),
                RotationAngle.fromDegrees(leftLowerLeg, 30, 0, 0)
        });
        ModelPose<LittleFeetEntity> heavyslash2 = new ModelPose<>(new RotationAngle[]{
                RotationAngle.fromDegrees(body, 0, -60, 0),
                RotationAngle.fromDegrees(upperPart, 0, 0, 0),
                RotationAngle.fromDegrees(rightArm, -90, 12.5, 0),
                RotationAngle.fromDegrees(rightForeArm, 0, 0, -40),
                RotationAngle.fromDegrees(leftArm, 47.5, -35, 0),
                RotationAngle.fromDegrees(leftForeArm, -92.5024, -2.4976, 90.1091),
                RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(rightLeg, 0, 0, 10),
                RotationAngle.fromDegrees(rightLowerLeg, 32.5, 0, 0),
                RotationAngle.fromDegrees(leftLeg, -5.3903, 3.7317, -11.9384),
                RotationAngle.fromDegrees(leftLowerLeg, 30, 0, 0)
        });



        actionAnim.put(StandPose.HEAVY_ATTACK_FINISHER, new PosedActionAnimation.Builder<LittleFeetEntity>()
                .addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransitionMultiple.Builder<>(idlePose)
                        .addPose(0.15F, heavyslash0)
                        .addPose(0.80F, heavyslash1)
                        .build(heavyslash2))
                .addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(heavyslash2)
                        .addPose(0.9F, heavyslash2)
                        .build(idlePose))
                .build(idlePose));
        super.initActionPoses();
    }
    
    

    @Override
    protected ModelPose<LittleFeetEntity> initIdlePose() {
        return new ModelPose<>(new RotationAngle[]{

                RotationAngle.fromDegrees(body, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(upperPart, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(leftArm, -9.8161, -14.9084, -20.3018),
                RotationAngle.fromDegrees(leftForeArm, -21.2351, 10.6734, 6.4996),
                RotationAngle.fromDegrees(rightArm, 0.0F, -7.5, 22.5),
                RotationAngle.fromDegrees(rightForeArm, -35.5987, -10.8036, 6.3253),
                RotationAngle.fromDegrees(leftLeg, -1.394, -29.001, -11.9571),
                RotationAngle.fromDegrees(leftLowerLeg, 30, 0.0F, 0.0F),
                RotationAngle.fromDegrees(rightLeg, -19.7988, 28.0265, 3.2343),
                RotationAngle.fromDegrees(rightLowerLeg, 32.5, 0.0F, 0.0F)
        });
    }


    @Override
    protected IModelPose<LittleFeetEntity> initIdlePose2Loop() {
        return new ModelPose<>(new RotationAngle[] {

                RotationAngle.fromDegrees(body, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(upperPart, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
                RotationAngle.fromDegrees(leftArm, -2.3161, -14.9084, -20.3018),
                RotationAngle.fromDegrees(leftForeArm, -11.2351, 10.6734, 6.4996),
                RotationAngle.fromDegrees(rightArm, 0.6574, -7.4713, 17.4571),
                RotationAngle.fromDegrees(rightForeArm, -25.5987, -10.8036, 6.3253),
                RotationAngle.fromDegrees(leftLeg, -1.394, -29.001, -11.9571),
                RotationAngle.fromDegrees(leftLowerLeg, 42.5, 0.0F, 0.0F),
                RotationAngle.fromDegrees(rightLeg, -19.7988, 28.0265, 3.2343),
                RotationAngle.fromDegrees(rightLowerLeg, 47.5, 0.0F, 0.0F)
        });
    }
}