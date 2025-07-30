import com.fasterxml.jackson.core.JsonProcessingException;
import model.Patient;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class PAMSApp {
    public static void main(String[] args) throws JsonProcessingException {
        List<Patient> patients = Arrays.asList(
                new Patient(1, "Daniel", "Agar", "(641) 123-0009", "dagar@m.as", "1 N Street", LocalDate.of(1987,1,19)),
                new Patient(2, "Ana", "Smith", "", "amsith@te.edu", "", LocalDate.of(1948,12,5)),
                new Patient(3, "Marcus", "Garvey", "(123) 292-0018", "", "4 East Ave", LocalDate.of(2001,9,18)),
                new Patient(4, "Jeff", "Goldbloom", "(999) 165-1192", "jgold@es.co.za", "", LocalDate.of(1995,2,28)),
                new Patient(5, "Mary", "Washington", "", "", "30 W Burlington", LocalDate.of(1932,5,31))
        );

        patients.sort((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));

        ObjectMapper mapper = new ObjectMapper();
        for (Patient p : patients) {
            ObjectNode node = mapper.createObjectNode();
            node.put("id", p.getId());
            node.put("firstName", p.getFirstName());
            node.put("lastName", p.getLastName());
            node.put("phoneNo", p.getPhoneNo());
            node.put("email", p.getEmail());
            node.put("mailingAddress", p.getMailingAddress());
            node.put("dateOfBirth", p.getDateOfBirth().toString());
            node.put("age", p.getAge());
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(node));
        }
    }
}
