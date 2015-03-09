
/**
 * @author Rodnie Rutterbush
 * @version 03.5.15
 * ASSIGNMENT: CIS 225 Midterm
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IncidentReport {
    // String Variables
    private String lastName; 
    private String firstName; 
    private String injuryLocation; 
    private String injuryType; 
    private String address;
    // Int variables
    private int IDNum;
    private int severity;
    private int age;
    //Arrays
    private Patients[][][][][][][][]patient;

    
    
    public IncidentReport() {
        IDNum = 00000;
        
     
    }
    public void patientPersonal (String lastName, String firstName, String address, int age) {
        System.out.println("Last Name:" + lastName+"");
        System.out.println("First Name:" +firstName+"");
        System.out.println("Address:"+address+"");
        System.out.println("Patient Age:"+age+"");
    }
    public void patientSeverity (int severity) {
        final int MIN = 1;
        final int MAX = 10;
        if (severity < MIN){
            System.out.println(" Please select a severity between 1 & 10 with 10 being most severe");
            patientSeverity();
        ifelse (severity > MAX);{
            System.out.println(" Please select a severity between 1 & 10 with 10 being most severe");
            patientSeverity();
        else { patientInjury();
        }
    }
}
    public void injuryLocation(String injuryLocation){
        System.out.pringln("Please select one of the following locations");
        System.out.println("Arms");
        System.out.println("Abdomen");
        System.out.println("Head"):
        System.out.println("Legs");
    }
    public void injuryType(String injuryType){
        System.out.println("Please select one of the following injury types")
        System.out.println("Break");
        System.out.println("Sprain/Strain");
        System.out.println("Burn");
        System.out.println("Soft Tissue Slash");
        System.out.println("Soft Tissue Blunt");
    }
    public void IDGeneration (){
        IDNum = 1 + IDNum;
    }
    public void printReport(){
        System.out.println("PatientID:"+IDNum+"");
        System.out.println(""+lastName+","+firstName+"");
        System.out.println(""+address+"");
        System.out.println("Age:"+age+"");
        System.out.println("Severity:"+severity+"");
        System.out.println("Injury Location:"+injuryLocation+"");
        System.out.println("Injury Type:"+injuryType+"");
    
}
