package ma.emsi.hopitaltp2.service;


import jakarta.transaction.Transactional;
import ma.emsi.hopitaltp2.entities.Consultation;
import ma.emsi.hopitaltp2.entities.Medcin;
import ma.emsi.hopitaltp2.entities.Patient;
import ma.emsi.hopitaltp2.entities.RendezVous;
import ma.emsi.hopitaltp2.repositories.ConsultationRepository;
import ma.emsi.hopitaltp2.repositories.MedcinRepository;
import ma.emsi.hopitaltp2.repositories.PatientRepository;
import ma.emsi.hopitaltp2.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HopitalServiceImpl implements IHopitalService {
    private PatientRepository patientRepository;
    private MedcinRepository medcinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;


    public HopitalServiceImpl(PatientRepository patientRepository, MedcinRepository medcinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medcinRepository = medcinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medcin saveMedcin(Medcin medcin) {
        return medcinRepository.save(medcin);
    }
    //Appliquer les regles metiers pour chaque methode si dispo si date dispo etc .....
    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
