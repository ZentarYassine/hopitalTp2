package ma.emsi.hopitaltp2.service;


import ma.emsi.hopitaltp2.entities.Consultation;
import ma.emsi.hopitaltp2.entities.Medcin;
import ma.emsi.hopitaltp2.entities.Patient;
import ma.emsi.hopitaltp2.entities.RendezVous;

public interface IHopitalService {
     Patient savePatient(Patient patient);
     Medcin saveMedcin(Medcin medcin);
     RendezVous saveRendezVous(RendezVous rendezVous);
     Consultation saveConsultation(Consultation consultation);
}
