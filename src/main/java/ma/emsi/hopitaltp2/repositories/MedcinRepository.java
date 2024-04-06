package ma.emsi.hopitaltp2.repositories;

import ma.emsi.hopitaltp2.entities.Medcin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepository extends JpaRepository<Medcin,Long> {
    Medcin findByNom(String nom);
}
