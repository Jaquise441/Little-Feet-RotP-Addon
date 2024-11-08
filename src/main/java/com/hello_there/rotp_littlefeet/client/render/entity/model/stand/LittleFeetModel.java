package com.hello_there.rotp_littlefeet.client.render.entity.model.stand;

import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.pose.IModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import com.hello_there.rotp_littlefeet.entity.LittleFeetEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

public class LittleFeetModel extends HumanoidStandModel<LittleFeetEntity> {

    private final ModelRenderer bone6;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer bone7;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer hair;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer torso_r1;
    private final ModelRenderer strip;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer strip2;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer bone5;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer stripleg;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer stripleg4;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer stripleg2;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer stripleg3;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;

    public LittleFeetModel() {
        super();

        addHumanoidBaseBoxes(null);
        texWidth = 128;
        texHeight = 128;

        head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.texOffs(32, 51).addBox(-2.0F, -7.0F, -3.9F, 4.0F, 8.0F, 2.0F, 0.25F, false);
        head.texOffs(24, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 2.0F, 0.25F, false);
        head.texOffs(90, 25).addBox(-3.1F, -4.7F, -4.1F, 1.0F, 1.0F, 2.0F, 0.25F, false);
        head.texOffs(90, 47).addBox(-3.1F, -2.7F, -4.1F, 1.0F, 1.0F, 2.0F, 0.25F, false);
        head.texOffs(90, 53).addBox(2.1F, -4.7F, -4.1F, 1.0F, 1.0F, 2.0F, 0.25F, false);
        head.texOffs(90, 50).addBox(2.1F, -2.7F, -4.1F, 1.0F, 1.0F, 2.0F, 0.25F, false);

        bone6 = new ModelRenderer(this);
        bone6.setPos(-12.8F, 6.4F, 1.6F);
        head.addChild(bone6);
        bone6.texOffs(76, 33).addBox(5.1F, -13.4F, 0.4F, 0.0F, 3.0F, 4.0F, 0.0F, false);
        bone6.texOffs(86, 40).addBox(3.7F, -13.4F, -5.0F, 3.0F, 3.0F, 1.0F, 0.25F, false);
        bone6.texOffs(48, 50).addBox(3.7F, -13.4F, -3.8F, 3.0F, 3.0F, 5.0F, 0.25F, false);
        bone6.texOffs(76, 0).addBox(3.7F, -13.5F, -5.2F, 3.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(7.1F, -11.9F, -1.0F);
        bone6.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0873F);
        cube_r1.texOffs(80, 73).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(4.1F, -11.9F, -1.3F);
        bone6.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.3927F, 0.0F, -1.5708F);
        cube_r2.texOffs(90, 56).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.25F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(5.1F, -10.9F, -1.3F);
        bone6.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.3927F, 0.0F, 3.1416F);
        cube_r3.texOffs(90, 79).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.25F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(5.1F, -12.9F, -1.3F);
        bone6.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        cube_r4.texOffs(52, 88).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.25F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(5.1F, -11.9F, 2.4F);
        bone6.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -1.5708F);
        cube_r5.texOffs(78, 23).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

        bone7 = new ModelRenderer(this);
        bone7.setPos(12.8F, 6.4F, 1.6F);
        head.addChild(bone7);
        bone7.texOffs(78, 56).addBox(-5.1F, -13.4F, 0.4F, 0.0F, 3.0F, 4.0F, 0.0F, false);
        bone7.texOffs(16, 88).addBox(-6.7F, -13.4F, -5.0F, 3.0F, 3.0F, 1.0F, 0.25F, false);
        bone7.texOffs(16, 51).addBox(-6.7F, -13.4F, -3.8F, 3.0F, 3.0F, 5.0F, 0.25F, false);
        bone7.texOffs(78, 63).addBox(-6.7F, -13.5F, -5.2F, 3.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(-7.1F, -11.9F, -1.0F);
        bone7.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, -0.0873F);
        cube_r6.texOffs(86, 14).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(-4.1F, -11.9F, -1.3F);
        bone7.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.3927F, 0.0F, 1.5708F);
        cube_r7.texOffs(90, 87).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.25F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(-5.1F, -10.9F, -1.3F);
        bone7.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.3927F, 0.0F, -3.1416F);
        cube_r8.texOffs(86, 90).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.25F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(-5.1F, -12.9F, -1.3F);
        bone7.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
        cube_r9.texOffs(90, 83).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.25F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(-5.1F, -11.9F, 2.4F);
        bone7.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 1.5708F);
        cube_r10.texOffs(78, 40).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

        hair = new ModelRenderer(this);
        hair.setPos(0.0F, 0.0F, 0.0F);
        head.addChild(hair);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(4.8F, -5.1F, 2.6F);
        hair.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.2094F, 0.0F, 0.0F);
        cube_r11.texOffs(62, 73).addBox(-4.0F, -7.0F, 0.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(3.5F, -5.8F, 2.6F);
        hair.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        cube_r12.texOffs(12, 77).addBox(-4.0F, -7.0F, 0.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(2.0F, -5.6F, 2.5F);
        hair.addChild(cube_r13);
        setRotationAngle(cube_r13, -0.2967F, 0.0F, 0.0F);
        cube_r13.texOffs(0, 74).addBox(-4.0F, -7.0F, 0.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(1.1F, -4.5F, 1.7F);
        hair.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.3229F, 0.0F, 0.0F);
        cube_r14.texOffs(32, 84).addBox(-4.0F, -6.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(0.0F, -5.1F, 1.9F);
        hair.addChild(cube_r15);
        setRotationAngle(cube_r15, -0.301F, 0.0082F, -0.084F);
        cube_r15.texOffs(48, 65).addBox(-4.0F, -6.0F, 0.0F, 1.0F, 10.0F, 2.0F, 0.25F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(5.9F, -5.7F, 2.4F);
        hair.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.192F, 0.0F, 0.0F);
        cube_r16.texOffs(28, 84).addBox(-4.0F, -6.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(-1.1F, -5.1F, 1.9F);
        hair.addChild(cube_r17);
        setRotationAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
        cube_r17.texOffs(36, 85).addBox(3.0F, -6.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(-6.6F, -5.0F, 3.8F);
        hair.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.2618F, 0.0F, 0.0F);
        cube_r18.texOffs(86, 52).addBox(3.0F, -5.0F, 0.0F, 1.0F, 8.0F, 1.0F, 0.25F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(-4.9F, -4.8F, 3.8F);
        hair.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.2618F, 0.0F, 0.0F);
        cube_r19.texOffs(86, 21).addBox(3.0F, -5.0F, 0.0F, 1.0F, 8.0F, 1.0F, 0.25F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(-3.9F, -4.1F, 3.5F);
        hair.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.2182F, 0.0F, 0.0F);
        cube_r20.texOffs(86, 5).addBox(3.0F, -5.0F, 0.0F, 1.0F, 8.0F, 1.0F, 0.25F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(-2.5F, -4.6F, 3.8F);
        hair.addChild(cube_r21);
        setRotationAngle(cube_r21, -0.2618F, 0.0F, 0.0F);
        cube_r21.texOffs(86, 81).addBox(3.0F, -5.0F, 0.0F, 1.0F, 8.0F, 1.0F, 0.25F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(-1.3F, -4.3F, 3.5F);
        hair.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.2182F, 0.0F, 0.0F);
        cube_r22.texOffs(60, 85).addBox(3.0F, -5.0F, 0.0F, 1.0F, 8.0F, 1.0F, 0.25F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(-5.9F, -6.3F, 3.8F);
        hair.addChild(cube_r23);
        setRotationAngle(cube_r23, -0.2618F, 0.0F, 0.0F);
        cube_r23.texOffs(78, 81).addBox(3.0F, -6.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(-4.8F, -4.3F, 2.8F);
        hair.addChild(cube_r24);
        setRotationAngle(cube_r24, -0.3491F, 0.0F, 0.0F);
        cube_r24.texOffs(52, 77).addBox(3.0F, -6.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(-3.5F, -5.0F, 2.8F);
        hair.addChild(cube_r25);
        setRotationAngle(cube_r25, -0.4014F, 0.0F, 0.0F);
        cube_r25.texOffs(78, 12).addBox(3.0F, -6.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(-2.0F, -4.8F, 2.7F);
        hair.addChild(cube_r26);
        setRotationAngle(cube_r26, -0.4363F, 0.0F, 0.0F);
        cube_r26.texOffs(82, 5).addBox(3.0F, -6.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(0.3F, -5.7F, 3.5F);
        hair.addChild(cube_r27);
        setRotationAngle(cube_r27, -0.1913F, 0.0166F, 0.0857F);
        cube_r27.texOffs(42, 65).addBox(3.0F, -6.0F, -1.0F, 1.0F, 10.0F, 2.0F, 0.25F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(-5.9F, -5.8F, 3.4F);
        hair.addChild(cube_r28);
        setRotationAngle(cube_r28, -0.3927F, 0.0F, 0.0F);
        cube_r28.texOffs(16, 77).addBox(3.0F, -6.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setPos(-1.1F, -4.6F, 2.7F);
        hair.addChild(cube_r29);
        setRotationAngle(cube_r29, -0.3927F, 0.0F, 0.0F);
        cube_r29.texOffs(20, 77).addBox(3.0F, -6.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setPos(0.3F, -8.8F, 1.8F);
        hair.addChild(cube_r30);
        setRotationAngle(cube_r30, -0.2161F, 0.0301F, 0.1364F);
        cube_r30.texOffs(18, 65).addBox(3.0F, -6.0F, -1.0F, 1.0F, 10.0F, 2.0F, 0.25F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setPos(-2.0F, -9.2F, 0.8F);
        hair.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.2793F, 0.0F, 0.0F);
        cube_r31.texOffs(74, 76).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setPos(-3.0F, -6.7F, 2.0F);
        hair.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.3142F, 0.0F, 0.0F);
        cube_r32.texOffs(70, 58).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setPos(-3.5F, -8.1F, 0.7F);
        hair.addChild(cube_r33);
        setRotationAngle(cube_r33, -0.3142F, 0.0F, 0.0F);
        cube_r33.texOffs(58, 73).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setPos(-4.8F, -7.4F, 0.7F);
        hair.addChild(cube_r34);
        setRotationAngle(cube_r34, -0.3665F, 0.0F, 0.0F);
        cube_r34.texOffs(66, 65).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setPos(-5.9F, -7.7F, 0.9F);
        hair.addChild(cube_r35);
        setRotationAngle(cube_r35, -0.4538F, 0.0F, 0.0F);
        cube_r35.texOffs(4, 74).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setPos(-7.5F, -8.0F, 2.1F);
        hair.addChild(cube_r36);
        setRotationAngle(cube_r36, -0.2895F, -0.023F, -0.0171F);
        cube_r36.texOffs(56, 85).addBox(3.0F, -6.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setPos(-1.1F, -8.4F, 2.6F);
        hair.addChild(cube_r37);
        setRotationAngle(cube_r37, -0.3229F, 0.0F, 0.0F);
        cube_r37.texOffs(74, 12).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setPos(5.9F, -7.1F, 2.5F);
        hair.addChild(cube_r38);
        setRotationAngle(cube_r38, -0.4014F, 0.0F, 0.0F);
        cube_r38.texOffs(74, 56).addBox(-4.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setPos(0.6F, -6.8F, 3.0F);
        hair.addChild(cube_r39);
        setRotationAngle(cube_r39, -0.5603F, -0.0934F, -0.1476F);
        cube_r39.texOffs(12, 65).addBox(-4.0F, -6.0F, -2.0F, 1.0F, 10.0F, 2.0F, 0.25F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setPos(2.0F, -8.3F, 2.4F);
        hair.addChild(cube_r40);
        setRotationAngle(cube_r40, -0.4538F, 0.0F, 0.0F);
        cube_r40.texOffs(70, 15).addBox(-4.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setPos(3.5F, -7.5F, 2.3F);
        hair.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.4887F, 0.0F, 0.0F);
        cube_r41.texOffs(70, 76).addBox(-4.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setPos(4.8F, -6.8F, 2.3F);
        hair.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.5411F, 0.0F, 0.0F);
        cube_r42.texOffs(24, 67).addBox(-4.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setPos(-7.4F, -9.4F, 1.3F);
        hair.addChild(cube_r43);
        setRotationAngle(cube_r43, -0.1309F, 0.0F, 0.0F);
        cube_r43.texOffs(24, 84).addBox(3.0F, -6.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setPos(-4.8F, -7.8F, -0.1F);
        hair.addChild(cube_r44);
        setRotationAngle(cube_r44, -0.2356F, 0.0F, 0.0F);
        cube_r44.texOffs(36, 73).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setPos(0.0F, -11.466F, -1.0183F);
        hair.addChild(cube_r45);
        setRotationAngle(cube_r45, -0.1826F, -0.0159F, -0.0858F);
        cube_r45.texOffs(54, 65).addBox(-0.5F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setPos(-2.0F, -8.3F, -0.7F);
        hair.addChild(cube_r46);
        setRotationAngle(cube_r46, -0.1484F, 0.0F, 0.0F);
        cube_r46.texOffs(8, 66).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setPos(-1.1F, -6.9F, 0.8F);
        hair.addChild(cube_r47);
        setRotationAngle(cube_r47, -0.192F, 0.0F, 0.0F);
        cube_r47.texOffs(28, 67).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setPos(-0.2F, -7.8F, 1.0F);
        hair.addChild(cube_r48);
        setRotationAngle(cube_r48, -0.0873F, 0.0F, 0.0F);
        cube_r48.texOffs(64, 15).addBox(3.0F, -6.0F, -2.0F, 1.0F, 10.0F, 2.0F, 0.25F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setPos(-5.9F, -9.1F, 0.1F);
        hair.addChild(cube_r49);
        setRotationAngle(cube_r49, -0.3229F, 0.0F, 0.0F);
        cube_r49.texOffs(32, 67).addBox(3.0F, -7.0F, -1.0F, 1.0F, 11.0F, 1.0F, 0.25F, false);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setPos(0.3F, -9.6F, -1.5F);
        hair.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0519F, 0.0073F, -0.1394F);
        cube_r50.texOffs(44, 77).addBox(-4.0F, -6.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setPos(6.9F, -8.7F, -1.3F);
        hair.addChild(cube_r51);
        setRotationAngle(cube_r51, -0.1335F, 0.0066F, 0.1298F);
        cube_r51.texOffs(82, 81).addBox(-4.0F, -6.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setPos(5.9F, -10.0F, -1.5F);
        hair.addChild(cube_r52);
        setRotationAngle(cube_r52, -0.2182F, 0.0F, 0.0F);
        cube_r52.texOffs(40, 77).addBox(-4.0F, -6.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setPos(4.8F, -8.2F, -2.2F);
        hair.addChild(cube_r53);
        setRotationAngle(cube_r53, -0.0816F, 0.0022F, 0.1557F);
        cube_r53.texOffs(48, 77).addBox(-4.0F, -6.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setPos(3.5F, -9.4F, -2.2F);
        hair.addChild(cube_r54);
        setRotationAngle(cube_r54, -0.0785F, 0.0F, 0.0F);
        cube_r54.texOffs(8, 78).addBox(-4.0F, -6.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setPos(1.6F, -9.8F, -2.1F);
        hair.addChild(cube_r55);
        setRotationAngle(cube_r55, -0.1744F, 0.0038F, -0.0442F);
        cube_r55.texOffs(66, 77).addBox(-4.0F, -6.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.25F, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setPos(0.1F, -8.4F, -1.0F);
        hair.addChild(cube_r56);
        setRotationAngle(cube_r56, -0.0873F, 0.0F, 0.0F);
        cube_r56.texOffs(36, 61).addBox(-4.0F, -6.0F, -1.0F, 1.0F, 10.0F, 2.0F, 0.25F, false);

        torso.texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        torso.texOffs(48, 25).addBox(-3.5F, 1.1F, -2.0F, 7.0F, 3.0F, 1.0F, 0.4F, false);
        torso.texOffs(0, 52).addBox(-2.5F, 4.0F, -2.3F, 5.0F, 6.0F, 1.0F, 0.0F, false);
        torso.texOffs(64, 0).addBox(-1.0F, 11.5F, -2.3F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        torso.texOffs(24, 26).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, 0.25F, false);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setPos(0.0F, 16.8F, 4.0F);
        torso.addChild(cube_r57);
        setRotationAngle(cube_r57, 3.0107F, 0.0F, 0.0F);
        cube_r57.texOffs(0, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.25F, false);

        torso_r1 = new ModelRenderer(this);
        torso_r1.setPos(-0.5F, 12.4F, 1.1F);
        torso.addChild(torso_r1);
        setRotationAngle(torso_r1, -0.9599F, 0.0F, 0.0F);
        torso_r1.texOffs(64, 36).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        strip = new ModelRenderer(this);
        strip.setPos(1.4F, 9.3F, -0.8F);
        torso.addChild(strip);


        cube_r58 = new ModelRenderer(this);
        cube_r58.setPos(0.3F, -2.0F, 1.6F);
        strip.addChild(cube_r58);
        setRotationAngle(cube_r58, 1.5708F, 0.0F, 0.0F);
        cube_r58.texOffs(44, 58).addBox(0.0F, 0.0F, -4.5F, 0.0F, 1.0F, 6.0F, 0.25F, false);
        cube_r58.texOffs(56, 29).addBox(1.2F, 0.0F, -4.5F, 0.0F, 1.0F, 6.0F, 0.25F, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setPos(0.6F, -5.3F, 1.6F);
        strip.addChild(cube_r59);
        setRotationAngle(cube_r59, 1.5708F, 0.0F, 0.1745F);
        cube_r59.texOffs(88, 75).addBox(0.0F, 0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.25F, false);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setPos(1.8F, -5.3F, 1.6F);
        strip.addChild(cube_r60);
        setRotationAngle(cube_r60, 1.5708F, 0.0F, 0.1745F);
        cube_r60.texOffs(70, 88).addBox(0.0F, 0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.25F, false);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setPos(-0.3F, 0.0F, 0.0F);
        strip.addChild(cube_r61);
        setRotationAngle(cube_r61, -1.5708F, 0.0F, 0.0F);
        cube_r61.texOffs(70, 70).addBox(0.0F, 0.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.25F, false);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setPos(-0.3F, -2.0F, -0.3F);
        strip.addChild(cube_r62);
        setRotationAngle(cube_r62, -1.5708F, 0.0F, 0.0F);
        cube_r62.texOffs(68, 27).addBox(0.0F, 0.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.25F, false);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setPos(1.3F, -2.0F, 0.0F);
        strip.addChild(cube_r63);
        setRotationAngle(cube_r63, -1.5708F, 0.0F, 0.0F);
        cube_r63.texOffs(48, 0).addBox(0.0F, 0.0F, -3.5F, 0.0F, 1.0F, 8.0F, 0.25F, false);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setPos(2.1F, -8.6F, 0.0F);
        strip.addChild(cube_r64);
        setRotationAngle(cube_r64, -1.5708F, 0.0F, 0.0F);
        cube_r64.texOffs(40, 88).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.25F, false);
        cube_r64.texOffs(46, 88).addBox(-1.2F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.25F, false);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setPos(0.9F, -8.6F, 1.6F);
        strip.addChild(cube_r65);
        setRotationAngle(cube_r65, -1.5708F, 0.0F, 0.0F);
        cube_r65.texOffs(12, 52).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 0.25F, false);
        cube_r65.texOffs(44, 51).addBox(1.2F, -1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 0.25F, false);

        bone3 = new ModelRenderer(this);
        bone3.setPos(1.7217F, -6.9195F, -1.0F);
        strip.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, 0.0873F);


        cube_r66 = new ModelRenderer(this);
        cube_r66.setPos(0.0F, 0.0F, 0.0F);
        bone3.addChild(cube_r66);
        setRotationAngle(cube_r66, -1.5708F, 0.0F, 0.1396F);
        cube_r66.texOffs(44, 55).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 0.25F, false);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setPos(0.0783F, -0.5805F, 0.5F);
        bone3.addChild(cube_r67);
        setRotationAngle(cube_r67, -1.5708F, 0.0F, 0.1396F);
        cube_r67.texOffs(42, 61).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, 0.25F, false);

        bone2 = new ModelRenderer(this);
        bone2.setPos(0.6F, -7.4F, -0.5F);
        strip.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, 0.0873F);


        cube_r68 = new ModelRenderer(this);
        cube_r68.setPos(-0.1F, 0.0F, 0.0F);
        bone2.addChild(cube_r68);
        setRotationAngle(cube_r68, -1.5708F, 0.0F, 0.2269F);
        cube_r68.texOffs(88, 66).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 3.0F, 0.25F, false);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setPos(0.7F, -3.5F, 0.0F);
        bone2.addChild(cube_r69);
        setRotationAngle(cube_r69, -1.5708F, 0.0F, 0.2269F);
        cube_r69.texOffs(42, 63).addBox(0.0F, 0.0F, 2.5F, 0.0F, 1.0F, 1.0F, 0.25F, false);

        strip2 = new ModelRenderer(this);
        strip2.setPos(-1.4F, 9.3F, -0.8F);
        torso.addChild(strip2);


        cube_r70 = new ModelRenderer(this);
        cube_r70.setPos(-1.3F, -2.0F, 0.0F);
        strip2.addChild(cube_r70);
        setRotationAngle(cube_r70, -1.5708F, 0.0F, 0.0F);
        cube_r70.texOffs(48, 41).addBox(0.0F, 0.0F, -3.5F, 0.0F, 1.0F, 8.0F, 0.25F, false);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setPos(0.3F, 0.0F, 0.0F);
        strip2.addChild(cube_r71);
        setRotationAngle(cube_r71, -1.5708F, 0.0F, 0.0F);
        cube_r71.texOffs(72, 6).addBox(0.0F, 0.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.25F, false);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setPos(0.3F, -2.0F, -0.3F);
        strip2.addChild(cube_r72);
        setRotationAngle(cube_r72, -1.5708F, 0.0F, 0.0F);
        cube_r72.texOffs(72, 50).addBox(0.0F, 0.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.25F, false);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setPos(-0.6F, -5.3F, 1.6F);
        strip2.addChild(cube_r73);
        setRotationAngle(cube_r73, 1.5708F, 0.0F, -0.1745F);
        cube_r73.texOffs(90, 5).addBox(0.0F, 0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.25F, false);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setPos(-0.3F, -2.0F, 1.6F);
        strip2.addChild(cube_r74);
        setRotationAngle(cube_r74, 1.5708F, 0.0F, 0.0F);
        cube_r74.texOffs(0, 59).addBox(0.0F, 0.0F, -4.5F, 0.0F, 1.0F, 6.0F, 0.25F, false);
        cube_r74.texOffs(56, 58).addBox(-1.2F, 0.0F, -4.5F, 0.0F, 1.0F, 6.0F, 0.25F, false);

        cube_r75 = new ModelRenderer(this);
        cube_r75.setPos(-1.8F, -5.3F, 1.6F);
        strip2.addChild(cube_r75);
        setRotationAngle(cube_r75, 1.5708F, 0.0F, -0.1745F);
        cube_r75.texOffs(8, 89).addBox(0.0F, 0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.25F, false);

        cube_r76 = new ModelRenderer(this);
        cube_r76.setPos(-2.1F, -8.6F, 0.0F);
        strip2.addChild(cube_r76);
        setRotationAngle(cube_r76, -1.5708F, 0.0F, 0.0F);
        cube_r76.texOffs(64, 88).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.25F, false);
        cube_r76.texOffs(88, 61).addBox(1.2F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.25F, false);

        cube_r77 = new ModelRenderer(this);
        cube_r77.setPos(-0.9F, -8.6F, 1.6F);
        strip2.addChild(cube_r77);
        setRotationAngle(cube_r77, -1.5708F, 0.0F, 0.0F);
        cube_r77.texOffs(82, 52).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 0.25F, false);
        cube_r77.texOffs(60, 15).addBox(-1.2F, -1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 0.25F, false);

        bone4 = new ModelRenderer(this);
        bone4.setPos(-1.7217F, -6.9195F, -1.0F);
        strip2.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, -0.0873F);


        cube_r78 = new ModelRenderer(this);
        cube_r78.setPos(0.0F, 0.0F, 0.0F);
        bone4.addChild(cube_r78);
        setRotationAngle(cube_r78, -1.5708F, 0.0F, -0.1396F);
        cube_r78.texOffs(12, 56).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 0.25F, false);

        cube_r79 = new ModelRenderer(this);
        cube_r79.setPos(-0.0783F, -0.5805F, 0.5F);
        bone4.addChild(cube_r79);
        setRotationAngle(cube_r79, -1.5708F, 0.0F, -0.1396F);
        cube_r79.texOffs(68, 58).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, 0.25F, false);

        bone5 = new ModelRenderer(this);
        bone5.setPos(-0.6F, -7.4F, -0.5F);
        strip2.addChild(bone5);
        setRotationAngle(bone5, 0.0F, 0.0F, -0.0873F);


        cube_r80 = new ModelRenderer(this);
        cube_r80.setPos(0.1F, 0.0F, 0.0F);
        bone5.addChild(cube_r80);
        setRotationAngle(cube_r80, -1.5708F, 0.0F, -0.2269F);
        cube_r80.texOffs(90, 9).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 3.0F, 0.25F, false);

        cube_r81 = new ModelRenderer(this);
        cube_r81.setPos(-0.7F, -3.5F, 0.0F);
        bone5.addChild(cube_r81);
        setRotationAngle(cube_r81, -1.5708F, 0.0F, -0.2269F);
        cube_r81.texOffs(68, 60).addBox(0.0F, 0.0F, 2.5F, 0.0F, 1.0F, 1.0F, 0.25F, false);

        bone = new ModelRenderer(this);
        bone.setPos(0.0F, 12.9F, 0.8F);
        torso.addChild(bone);
        setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);
        bone.texOffs(44, 20).addBox(-4.0F, -2.0F, -0.5F, 8.0F, 3.0F, 2.0F, 0.0F, false);

        leftArm.texOffs(24, 31).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        cube_r82 = new ModelRenderer(this);
        cube_r82.setPos(1.9F, 2.2F, -0.4F);
        leftArm.addChild(cube_r82);
        setRotationAngle(cube_r82, -0.5061F, 0.0F, 0.0F);
        cube_r82.texOffs(48, 29).addBox(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r83 = new ModelRenderer(this);
        cube_r83.setPos(1.9F, 2.2F, 0.4F);
        leftArm.addChild(cube_r83);
        setRotationAngle(cube_r83, 0.5411F, 0.0F, 0.0F);
        cube_r83.texOffs(52, 29).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r84 = new ModelRenderer(this);
        cube_r84.setPos(1.9F, 0.0F, 0.0F);
        leftArm.addChild(cube_r84);
        setRotationAngle(cube_r84, 0.7854F, 0.0F, 0.0F);
        cube_r84.texOffs(86, 44).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.25F, false);

        cube_r85 = new ModelRenderer(this);
        cube_r85.setPos(1.9F, 0.0F, 0.0F);
        leftArm.addChild(cube_r85);
        setRotationAngle(cube_r85, -0.7854F, 0.0F, 0.0F);
        cube_r85.texOffs(78, 30).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.25F, false);

        leftArmJoint.texOffs(32, 10).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);
        leftArmJoint.texOffs(78, 76).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 3.0F, 0.25F, false);

        leftForeArm.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);

        cube_r86 = new ModelRenderer(this);
        cube_r86.setPos(3.4F, 1.3F, 0.0F);
        leftForeArm.addChild(cube_r86);
        setRotationAngle(cube_r86, -1.5708F, 0.0F, 1.5708F);
        cube_r86.texOffs(16, 32).addBox(2.0F, -2.0F, 1.5F, 0.0F, 4.0F, 4.0F, 0.25F, false);

        cube_r87 = new ModelRenderer(this);
        cube_r87.setPos(1.9F, 4.4F, -0.4F);
        leftForeArm.addChild(cube_r87);
        setRotationAngle(cube_r87, -0.5061F, 0.0F, 0.0F);
        cube_r87.texOffs(74, 68).addBox(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r88 = new ModelRenderer(this);
        cube_r88.setPos(1.9F, 4.4F, 0.4F);
        leftForeArm.addChild(cube_r88);
        setRotationAngle(cube_r88, 0.5411F, 0.0F, 0.0F);
        cube_r88.texOffs(78, 47).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r89 = new ModelRenderer(this);
        cube_r89.setPos(1.9F, 1.3F, -0.4F);
        leftForeArm.addChild(cube_r89);
        setRotationAngle(cube_r89, -0.5061F, 0.0F, 0.0F);
        cube_r89.texOffs(64, 27).addBox(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r90 = new ModelRenderer(this);
        cube_r90.setPos(1.9F, 1.3F, 0.4F);
        leftForeArm.addChild(cube_r90);
        setRotationAngle(cube_r90, 0.5411F, 0.0F, 0.0F);
        cube_r90.texOffs(74, 24).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        rightArm.texOffs(32, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        cube_r91 = new ModelRenderer(this);
        cube_r91.setPos(-1.9F, 0.0F, 0.0F);
        rightArm.addChild(cube_r91);
        setRotationAngle(cube_r91, -0.7854F, 0.0F, 0.0F);
        cube_r91.texOffs(90, 16).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.25F, false);

        cube_r92 = new ModelRenderer(this);
        cube_r92.setPos(-1.9F, 0.0F, 0.0F);
        rightArm.addChild(cube_r92);
        setRotationAngle(cube_r92, 0.7854F, 0.0F, 0.0F);
        cube_r92.texOffs(88, 70).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 0.25F, false);

        cube_r93 = new ModelRenderer(this);
        cube_r93.setPos(-1.9F, 2.2F, -0.4F);
        rightArm.addChild(cube_r93);
        setRotationAngle(cube_r93, -0.5061F, 0.0F, 0.0F);
        cube_r93.texOffs(28, 59).addBox(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r94 = new ModelRenderer(this);
        cube_r94.setPos(-1.9F, 2.2F, 0.4F);
        rightArm.addChild(cube_r94);
        setRotationAngle(cube_r94, 0.5411F, 0.0F, 0.0F);
        cube_r94.texOffs(24, 59).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        rightArmJoint.texOffs(12, 59).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);
        rightArmJoint.texOffs(24, 79).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 3.0F, 0.25F, false);

        rightForeArm.texOffs(40, 31).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);

        cube_r95 = new ModelRenderer(this);
        cube_r95.setPos(-1.9F, 4.4F, -0.4F);
        rightForeArm.addChild(cube_r95);
        setRotationAngle(cube_r95, -0.5061F, 0.0F, 0.0F);
        cube_r95.texOffs(82, 21).addBox(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r96 = new ModelRenderer(this);
        cube_r96.setPos(-1.9F, 4.4F, 0.4F);
        rightForeArm.addChild(cube_r96);
        setRotationAngle(cube_r96, 0.5411F, 0.0F, 0.0F);
        cube_r96.texOffs(90, 28).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r97 = new ModelRenderer(this);
        cube_r97.setPos(-3.4F, 1.3F, 0.0F);
        rightForeArm.addChild(cube_r97);
        setRotationAngle(cube_r97, -1.5708F, 0.0F, -1.5708F);
        cube_r97.texOffs(64, 50).addBox(-2.0F, -2.0F, 1.5F, 0.0F, 4.0F, 4.0F, 0.25F, false);

        cube_r98 = new ModelRenderer(this);
        cube_r98.setPos(-1.9F, 1.3F, 0.4F);
        rightForeArm.addChild(cube_r98);
        setRotationAngle(cube_r98, 0.5411F, 0.0F, 0.0F);
        cube_r98.texOffs(90, 73).addBox(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        cube_r99 = new ModelRenderer(this);
        cube_r99.setPos(-1.9F, 1.3F, -0.4F);
        rightForeArm.addChild(cube_r99);
        setRotationAngle(cube_r99, -0.5061F, 0.0F, 0.0F);
        cube_r99.texOffs(0, 91).addBox(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.25F, false);

        leftLeg.texOffs(16, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        stripleg = new ModelRenderer(this);
        stripleg.setPos(2.2F, 4.3F, -0.8F);
        leftLeg.addChild(stripleg);


        cube_r100 = new ModelRenderer(this);
        cube_r100.setPos(0.0F, 0.0F, 0.0F);
        stripleg.addChild(cube_r100);
        setRotationAngle(cube_r100, -1.5708F, 0.0F, 1.5708F);
        cube_r100.texOffs(68, 62).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, 0.25F, false);

        cube_r101 = new ModelRenderer(this);
        cube_r101.setPos(-1.0F, -3.5F, 0.0F);
        stripleg.addChild(cube_r101);
        setRotationAngle(cube_r101, -1.5708F, 0.0F, 0.0F);
        cube_r101.texOffs(56, 36).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 4.0F, 0.25F, false);
        cube_r101.texOffs(80, 68).addBox(-2.0F, 0.0F, -0.5F, 0.0F, 1.0F, 4.0F, 0.25F, false);

        stripleg4 = new ModelRenderer(this);
        stripleg4.setPos(2.2F, 4.3F, 0.8F);
        leftLeg.addChild(stripleg4);


        cube_r102 = new ModelRenderer(this);
        cube_r102.setPos(0.0F, 0.0F, 0.0F);
        stripleg4.addChild(cube_r102);
        setRotationAngle(cube_r102, 1.5708F, 0.0F, 1.5708F);
        cube_r102.texOffs(40, 73).addBox(0.0F, 0.0F, -2.5F, 0.0F, 1.0F, 1.0F, 0.25F, false);

        cube_r103 = new ModelRenderer(this);
        cube_r103.setPos(-1.0F, -3.5F, 0.0F);
        stripleg4.addChild(cube_r103);
        setRotationAngle(cube_r103, 1.5708F, 0.0F, 0.0F);
        cube_r103.texOffs(86, 0).addBox(0.0F, 0.0F, -3.5F, 0.0F, 1.0F, 4.0F, 0.25F, false);
        cube_r103.texOffs(0, 86).addBox(-2.0F, 0.0F, -3.5F, 0.0F, 1.0F, 4.0F, 0.25F, false);

        leftLegJoint.texOffs(60, 9).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

        leftLowerLeg.texOffs(32, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        leftLowerLeg.texOffs(90, 19).addBox(-1.0F, -1.0F, -2.7F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r104 = new ModelRenderer(this);
        cube_r104.setPos(-0.5F, 4.4F, -1.5F);
        leftLowerLeg.addChild(cube_r104);
        setRotationAngle(cube_r104, -1.5708F, -0.2618F, 1.5708F);
        cube_r104.texOffs(64, 6).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);

        cube_r105 = new ModelRenderer(this);
        cube_r105.setPos(3.5F, 2.2F, 0.0F);
        leftLowerLeg.addChild(cube_r105);
        setRotationAngle(cube_r105, -1.5708F, 0.0F, 1.5708F);
        cube_r105.texOffs(0, 66).addBox(2.0F, -2.0F, 1.5F, 0.0F, 4.0F, 4.0F, 0.25F, false);

        cube_r106 = new ModelRenderer(this);
        cube_r106.setPos(3.0F, 2.2F, -1.0F);
        leftLowerLeg.addChild(cube_r106);
        setRotationAngle(cube_r106, -1.5708F, 0.0F, 1.5708F);
        cube_r106.texOffs(64, 42).addBox(-2.0F, 0.0F, 1.5F, 4.0F, 1.0F, 3.0F, 0.25F, false);

        rightLeg.texOffs(0, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        rightLegJoint.texOffs(24, 61).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

        stripleg2 = new ModelRenderer(this);
        stripleg2.setPos(-2.2F, 4.3F, -0.8F);
        rightLeg.addChild(stripleg2);


        cube_r107 = new ModelRenderer(this);
        cube_r107.setPos(0.0F, 0.0F, 0.0F);
        stripleg2.addChild(cube_r107);
        setRotationAngle(cube_r107, -1.5708F, 0.0F, -1.5708F);
        cube_r107.texOffs(72, 12).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, 0.25F, false);

        cube_r108 = new ModelRenderer(this);
        cube_r108.setPos(1.0F, -3.5F, 0.0F);
        stripleg2.addChild(cube_r108);
        setRotationAngle(cube_r108, -1.5708F, 0.0F, 0.0F);
        cube_r108.texOffs(82, 47).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 4.0F, 0.25F, false);
        cube_r108.texOffs(82, 16).addBox(2.0F, 0.0F, -0.5F, 0.0F, 1.0F, 4.0F, 0.25F, false);

        stripleg3 = new ModelRenderer(this);
        stripleg3.setPos(-2.2F, 4.3F, 0.8F);
        rightLeg.addChild(stripleg3);


        cube_r109 = new ModelRenderer(this);
        cube_r109.setPos(0.0F, 0.0F, 0.0F);
        stripleg3.addChild(cube_r109);
        setRotationAngle(cube_r109, 1.5708F, 0.0F, -1.5708F);
        cube_r109.texOffs(72, 56).addBox(0.0F, 0.0F, -2.5F, 0.0F, 1.0F, 1.0F, 0.25F, false);

        cube_r110 = new ModelRenderer(this);
        cube_r110.setPos(1.0F, -3.5F, 0.0F);
        stripleg3.addChild(cube_r110);
        setRotationAngle(cube_r110, 1.5708F, 0.0F, 0.0F);
        cube_r110.texOffs(84, 35).addBox(0.0F, 0.0F, -3.5F, 0.0F, 1.0F, 4.0F, 0.25F, false);
        cube_r110.texOffs(84, 30).addBox(2.0F, 0.0F, -3.5F, 0.0F, 1.0F, 4.0F, 0.25F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setPos(0.0F, 6.0F, 0.0F);
        rightLeg.addChild(rightLowerLeg);
        rightLowerLeg.texOffs(44, 10).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        rightLowerLeg.texOffs(90, 22).addBox(-1.0F, -1.0F, -2.7F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r111 = new ModelRenderer(this);
        cube_r111.setPos(0.5F, 4.4F, -1.5F);
        rightLowerLeg.addChild(cube_r111);
        setRotationAngle(cube_r111, -1.5708F, 0.2618F, -1.5708F);
        cube_r111.texOffs(68, 33).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);

        cube_r112 = new ModelRenderer(this);
        cube_r112.setPos(-3.5F, 2.2F, 0.0F);
        rightLowerLeg.addChild(cube_r112);
        setRotationAngle(cube_r112, -1.5708F, 0.0F, -1.5708F);
        cube_r112.texOffs(58, 65).addBox(-2.0F, -2.0F, 1.5F, 0.0F, 4.0F, 4.0F, 0.25F, false);

        cube_r113 = new ModelRenderer(this);
        cube_r113.setPos(-3.0F, 2.2F, -1.0F);
        rightLowerLeg.addChild(cube_r113);
        setRotationAngle(cube_r113, -1.5708F, 0.0F, -1.5708F);
        cube_r113.texOffs(64, 46).addBox(-2.0F, 0.0F, 1.5F, 4.0F, 1.0F, 3.0F, 0.25F, false);
    }

    @Override // TODO summon poses
    protected RotationAngle[][] initSummonPoseRotations() {
        return new RotationAngle[][] {
            new RotationAngle[] {
                    
            },
            new RotationAngle[] {
                    
            }
		};
    }
    
    @Override
    protected void initActionPoses() {


        super.initActionPoses();
    }
    
    

    @Override
    protected ModelPose<LittleFeetEntity> initIdlePose() {
        return super.initIdlePose();
    }

    @Override
    protected IModelPose<LittleFeetEntity> initIdlePose2Loop() {
        return super.initIdlePose2Loop();
    }
}