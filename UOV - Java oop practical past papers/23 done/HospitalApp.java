import java.util.ArrayList;


public class HospitalApp {

    public static void main(String[] args) {
        // Patients
        Patient p1 = new Patient("P1001", "John Doe", 30, "Male");
        Patient p2 = new Patient("P1002", "Jane Smith", 18, "Female");
        Patient p3 = new Patient("P1003", "Michael Johnson", 6, "Male");
        Patient p4 = new Patient("P1004", "Tony Stark", 45, "Male");

        //Doctors
        Doctor d1 = new Doctor("D2001", "Dr. Emily Brown", "Cardiologist");
        Doctor d2 = new Doctor("D2002", "Dr. David Lee", "Pediatrician");
        Doctor d3 = new Doctor("D2003", "Dr. Sarah Williams", "Dermatologist");

        //Appointments
        Appointment a1 = new Appointment("A3001", "2023-07-15", d1, p2);
        Appointment a2 = new Appointment("A3002", "2023-07-15", d2, p3);
        Appointment a3 = new Appointment("A3003", "2023-07-17", d3, p2);
        Appointment a4 = new Appointment("A3004", "2023-07-20", d1, p1);
        Appointment a5 = new Appointment("A3005", "2023-07-20", d2, p4);
		
		// Store appointments in a list
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments.add(a1);
        appointments.add(a2);
        appointments.add(a3);
        appointments.add(a4);
        appointments.add(a5);

        for (Appointment x : appointments) {
            if (x.getA_id().equals("A3004")) {
                x.setA_date("2023-07-23");
                break;
            }
        }

        System.out.println("#################################");
        System.out.println("Appointments on 2023-07-15:");
        for (Appointment x : appointments) {
            if (x.getA_date().equals("2023-07-15")) {
                System.out.println(x.toString());
            }
        }

        System.out.println("######################################");
        System.out.println("Patients below 20 years of age:");
        Patient[] patients = {p1, p2, p3, p4};
        for (Patient p : patients) {
            if (p.getPatient_age() < 20) {
                System.out.println(p.toString());
            }
        }
	}
	
}

class Patient {
    private String patient_id;
    private String patient_name;
    private int patient_age;
    private String patient_gender;

    public Patient(String patient_id, String patient_name, int patient_age, String patient_gender){
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_gender = patient_gender;
    }

    public String getPatient_id(){
        return patient_id;
    }

    public String getPatient_name(){
        return patient_name;
    }

    public String getPatient_gender(){
        return patient_gender;
    }

    public int getPatient_age(){
        return patient_age;
    }

    public String toString(){
        return "\nPatient ID: " + patient_id + "\n" +
                "Name: " + patient_name + "\n" +
                "Age: " + patient_age + "\n" +
                "Gender: " + patient_gender;
    }

}

class Doctor{
    private String d_id;
    private String d_name;
    private String d_special;

    public Doctor(String d_id, String d_name, String d_special){
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_special = d_special;
    }

    public String getD_id(){
        return d_id;
    }

    public String getD_name(){
        return d_name;
    }

    public String getD_special(){
        return d_special;
    }

    public String toString(){
        return "\nDoctor ID: " + d_id + "\n"+
                "Doctor Name: " + d_name + "\n" +
                "Specialization: " + d_special;
    }

}

class Appointment{
    private String a_id;
    private String a_date;
    private Doctor d_details;

    private Patient p_details;

    public Appointment(String a_id, String a_date, Doctor d_details, Patient p_details){
        this.a_id = a_id;
        this.a_date = a_date;
        this.d_details = d_details;
        this.p_details = p_details;
    }

    public String getA_id() {
        return a_id;
    }

    public String getA_date() {
        return a_date;
    }

    public Doctor getD_details() {
        return d_details;
    }

    public Patient getP_details() {
        return p_details;
    }

    public void setA_date(String a_date) {
        this.a_date = a_date;
    }

    public String toString(){
        return "Appointment ID: " + a_id + "\n"+
                "Appointment Date: " + a_date + "\n" +
                "---Doctor's Details---" + d_details + "\n" +
                "---Patient Details--- " + p_details + "\n";
    }
}


