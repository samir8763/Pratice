package com.scripts.PraticeFb;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.PraticeFB.BaseTest;
import com.pages.PraticeFb.POMPraticeFB;

@Listeners(com.generics.PraticeFB.Utility.class)
public class TESTPraticeFb extends BaseTest
{
@Test
public void login() throws IOException, InterruptedException
{
	POMPraticeFB login=new POMPraticeFB(driver);
	login.loginMethod();
}
}
