package ma.emsi.hopitaltp2.repositories;

import ma.emsi.hopitaltp2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}
