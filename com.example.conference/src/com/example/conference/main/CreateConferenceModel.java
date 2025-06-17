package com.example.conference.main;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import conference.Conference;
import conference.ConferenceFactory;
import conference.ConferencePackage;
import conference.Speaker;
import conference.Talk;

public class CreateConferenceModel {

    public static void main(String[] args) {
        // --- 1. Initialization ---
        // Before you use a generated model, you need to register its package.
        ConferencePackage.eINSTANCE.eClass();
        
        // Get the factory so we can create model elements
        ConferenceFactory factory = ConferenceFactory.eINSTANCE;

        // --- 2. Create Model Objects in Memory ---
        System.out.println("Creating sample conference model in memory...");

        // Create Speakers
        Speaker speaker1 = factory.createSpeaker();
        speaker1.setName("Jane Doe");

        Speaker speaker2 = factory.createSpeaker();
        speaker2.setName("John Smith");

        // Create Talks
        Talk talk1 = factory.createTalk();
        talk1.setName("Introduction to EMF");
        talk1.setSpeaker(speaker1); // Set the reference to Jane Doe

        Talk talk2 = factory.createTalk();
        talk2.setName("Advanced Ecore Modeling");
        talk2.setSpeaker(speaker1); // Jane Doe gives another talk

        Talk talk3 = factory.createTalk();
        talk3.setName("Persistence with XMI");
        talk3.setSpeaker(speaker2); // Set the reference to John Smith

        // Create the root Conference object
        Conference conference = factory.createConference();
        conference.setName("EclipseCon 2023");

        // Add the speakers and talks to the conference (using containment references)
        conference.getSpeakers().add(speaker1);
        conference.getSpeakers().add(speaker2);
        
        conference.getTalk().add(talk1);
        conference.getTalk().add(talk2);
        conference.getTalk().add(talk3);
        
        System.out.println("Model creation complete.");

        // --- 3. Save the Model to an XMI file ---
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the XMI resource factory for the .xmi extension
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
            "xmi", new XMIResourceFactoryImpl());

        // Create a new resource in the resource set.
        URI fileURI = URI.createFileURI("conference.xmi");
        Resource resource = resourceSet.createResource(fileURI);

        // Add the root object (the conference) to the resource's contents.
        resource.getContents().add(conference);

        // Save the resource.
        try {
            System.out.println("Saving model to conference.xmi...");
            resource.save(Collections.EMPTY_MAP);
            System.out.println("Model saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving the model: " + e.getMessage());
            e.printStackTrace();
        }
    }
}