package com.trycloud.step_definitions;

import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotSteps {

    @When("step1")
    public void step1() throws AWTException {
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_DELETE);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_DELETE);
    }
}
