# Author: Bouchra
# Keywords Summary: Test scenarios for authentication feature

Feature: Authentification sur le site e-shop
  En tant qu'utilisateur
  Je souhaite m'authentifier sur le site e-shop
  Afin d'accéder à mon compte et passer des commandes


    
    
    
    Scenario: Ouvrir le site shop-in
  Given J'ouvre l'URL du site e-shop
  And L'utilisateur clique sur "Boutique"
  And L'utilisateur clique sur "Ajouter au panier"
  And L'utilisateur clique sur "Voir panier"
  And L'utilisateur clique sur "Verifier panier"
  And L'utilisateur clique sur "Valider les commandes"
  When L'utilisateur remplit les champs du formulaire de détails de facturation avec une nouvelle adresse e-mail inutilisée
  And L'utilisateur clique sur "Commander"
  Then L'utilisateur est enregistré et connecté avec succès
  
  
  
  
    
    
    