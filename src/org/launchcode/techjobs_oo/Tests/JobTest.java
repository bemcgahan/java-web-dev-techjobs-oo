package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job test_job_one;
    Job test_job_two;
    Job test_job_three;

    @Before
    public void createJobObject() {
        test_job_one = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_two = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        test_job_three = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
    }

    @Test
    public void testSettingJobId(){
        assertTrue(test_job_one.getId() != test_job_two.getId());
    }


    @Test
    public void testJobConstructorSetsNameField(){
        assertTrue(test_job_one.getName()=="Product tester");
    }

    @Test
    public void testJobConstructorSetsEmployerField(){
        assertEquals(test_job_one.getEmployer().getValue(), "ACME");
    }

    @Test
    public void testJobConstructorSetsLocationField(){
        assertEquals(test_job_one.getLocation().getValue(), "Desert");
    }

    @Test
    public void testJobConstructorSetsPositionTypeField(){
        assertEquals(test_job_one.getPositionType().getValue(), "Quality control");
    }

    @Test
    public void testJobConstructorSetsCoreCompTypeField(){
        assertEquals(test_job_one.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(test_job_one instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_job_two == test_job_three);
    }


//    @Test
//    public void returnBlankLines(){
//        assertEquals(test_job_one.toString(), "\n" + "Product tester" + "\n" + "ACME" + "\n" + "Desert" + "\n" + "Quality control" + "\n" + "Persistence" + "\n" );
//    }

    @Test
    public void returnLabels(){
        assertEquals(test_job_one.toString(), "\nID: "+ test_job_one.getId() + "\n" +"Name: Product tester" + "\n" + "Employer: ACME" + "\n" + "Location: Desert" + "\n" + "Position Type: Quality control" + "\n" + "Core Competency: Persistence" + "\n" );
    }


}
