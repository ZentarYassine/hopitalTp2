package ma.emsi.hopitaltp2.repositories;


import ma.emsi.hopitaltp2.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
