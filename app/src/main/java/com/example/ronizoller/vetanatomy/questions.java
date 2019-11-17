package com.example.ronizoller.vetanatomy;

import java.util.Random;

/**
 * Created by ronizoller on 02/11/2019.
 */

public class questions {
    private static question[] cat0 = {
            new question("this bone is?","scapula",R.mipmap.scapula),
            new question("1 is?","cranial angle",R.mipmap.scapula),
            new question( "2 is?","dorsal border",R.mipmap.scapula),
            new question("3 is?","infraspinous fossa",R.mipmap.scapula),
            new question( "4 is?","caudal angle",R.mipmap.scapula),
            new question("5 is?","caudal border",R.mipmap.scapula),
            new question( "6 is?","acromion",R.mipmap.scapula),
            new question("7 is?","ventral angle",R.mipmap.scapula),
            new question( "8 is?","superglenoid tubercle",R.mipmap.scapula),
            new question("9 is?","scapular notch",R.mipmap.scapula),
            new question( "10 is?","spine",R.mipmap.scapula),
            new question("11 is?","cranial border",R.mipmap.scapula),
            new question( "12 is?","superspinous fossa",R.mipmap.scapula),
            new question("13 is?","facies serrata",R.mipmap.scapula),
            new question( "14 is?","coracoid process",R.mipmap.scapula),
            new question("15 is?","supraglenoid tubercle",R.mipmap.scapula),
            new question( "16 is?","glenoin cavity",R.mipmap.scapula),
            new question("17 is?","infraglenoid tubercle",R.mipmap.scapula),
            new question( "18 is?","subscapular fossa",R.mipmap.scapula),
            new question("this bone is?","humerus",R.mipmap.humerus),
            new question("1 is?","lesser tubercle",R.mipmap.humerus),
            new question( "2 is?","intertubercular groove",R.mipmap.humerus),
            new question("3 is?","crest of greater tubercle",R.mipmap.humerus),
            new question( "4 is?","tuberosity fot teres major",R.mipmap.humerus),
            new question("5 is?","tricipital line",R.mipmap.humerus),
            new question( "6 is?","radial fossa",R.mipmap.humerus),
            new question("7 is?","supratrochlear foramen",R.mipmap.humerus),
            new question( "8 is?","trochlea",R.mipmap.humerus),
            new question("9 is?","condyle",R.mipmap.humerus),
            new question( "10 is?","greater tubercle",R.mipmap.humerus),
            new question( "12 is?","tuberosity for teres minor",R.mipmap.humerus),
            new question("13 is?","tricipital line",R.mipmap.humerus),
            new question( "14 is?","deltoid tubeosity",R.mipmap.humerus),
            new question("15 is?"," brachial groove ",R.mipmap.humerus),
            new question( "16 is?","lateral supracondylar crest",R.mipmap.humerus),
            new question("17 is?","lateral epicondyle",R.mipmap.humerus),
            new question( "18 is?","capitulum",R.mipmap.humerus),
            new question("19 is?","head",R.mipmap.humerus),
            new question("20 is?","lesser tubercle",R.mipmap.humerus),
            new question("21 is?","tuberosity of teres major",R.mipmap.humerus),
            new question("22 is?","olecranon fossa",R.mipmap.humerus),
            new question("23 is?","medial epicondyle",R.mipmap.humerus),
            new question("these bones are?","radius and ulna",R.mipmap.radius_and_ulna),
            new question("1 is?","olecranon",R.mipmap.radius_and_ulna),
            new question("2 is?","trochlear notch",R.mipmap.radius_and_ulna),
            new question("3 is?","coronoid processes",R.mipmap.radius_and_ulna),
            new question("4 is?","radial notch",R.mipmap.radius_and_ulna),
            new question("5 is?","ulnar tuberosity",R.mipmap.radius_and_ulna),
            new question("6 is?","interosseous border",R.mipmap.radius_and_ulna),
            new question("8 is?","articular circumference",R.mipmap.radius_and_ulna),
            new question("9 is?","styloid process",R.mipmap.radius_and_ulna),
            new question("10 is?","styloid process",R.mipmap.radius_and_ulna),
            new question("11 is?","carpal articular surface",R.mipmap.radius_and_ulna),
            new question("12 is?","trochlea",R.mipmap.radius_and_ulna),
            new question("13 is?","ulnar notch",R.mipmap.radius_and_ulna),
            new question("15 is?","lateral border",R.mipmap.radius_and_ulna),
            new question("16 is?","body",R.mipmap.radius_and_ulna),
            new question("17 is?","medial border",R.mipmap.radius_and_ulna),
            new question("18 is?","nutrient foramen",R.mipmap.radius_and_ulna),
            new question("19 is?","radial tuberosity",R.mipmap.radius_and_ulna),
            new question("20 is?","neck",R.mipmap.radius_and_ulna),
            new question("21 is?","head",R.mipmap.radius_and_ulna),
            new question("22 is?","articular circumference",R.mipmap.radius_and_ulna),
            new question("23 is?","fovea",R.mipmap.radius_and_ulna),
            new question("24 is?","medial epicondyle",R.mipmap.radius_and_ulna),
    };
    private static question[] cat1 = {
            new question("1 is?","scapula, spine",R.mipmap.slide1),
            new question("2 is?","infraspinatus",R.mipmap.slide1),
            new question("3 is?","scapula, caudal border",R.mipmap.slide1),
            new question("4 is?","teres major",R.mipmap.slide1),
            new question("5 is?","triceps brachii, long head",R.mipmap.slide1),
            new question("6 is?","extensor carpi radialis",R.mipmap.slide1),
            new question("7 is?","brachialis",R.mipmap.slide1),
            new question("8 is?","triceps brachii, lateral head",R.mipmap.slide1),
            new question("9 is?"," M. deltoideus ",R.mipmap.slide1),
            new question("10 is?","humerus, greater tubercle",R.mipmap.slide1),
            new question("11 is?","scapula, acromion",R.mipmap.slide1),
            new question("12 is?","supraspinatus",R.mipmap.slide1),
            new question("origin of M. deltoideus","the spine of the scapula and the underlying M. infraspinatus",-1),
            new question("insertion of M. deltoideus","deltoid tuberocity of the humerus",-1),
            new question("insertion of M. teres minor ","deltoid tuberocity of the humerus",-1),
            new question("origin of M.  teres minor ","Tuberositas teres minor on the Linea m. tricipitis of the humerus",-1),
            new question("function of M.  teres minor ","Flexion of the shoulder joint",-1),
            new question("insertion of M. infraspinatus","Facies m. infraspinati of the humerus",-1),
            new question("origin of M. infraspinatus ","Fossa infraspinata of the scapula",-1),
            new question("function of M. infraspinatus ","Flexion or extension of the shoulder joint; abduction and outward rotation of the humerus",-1),
            new question("insertion of M. supraspinatus ","Tub. majus of the humerus",-1),
            new question("origin of M. supraspinatus ","Fossa supraspinata of the scapula",-1),
            new question("function of M. supraspinatus ","Extension and stabilization of the shoulder joint",-1),
            new question("insertion of M. coracobrachialis","Distal portion of the Crista tuberculi minoris",-1),
            new question("origin of M. coracobrachialis","Proc. coracoideus of the scapula",-1),
            new question("function of M. coracobrachialis","Adduction and extension of the shoulder join",-1),
            new question("insertion of M. subscapularis","Tub. minus of the humerus",-1),
            new question("origin of M. subscapularis","Fossa subscapularis",-1),
            new question("function of M. subscapularis","Flexion, extension, adduction and stabilization of the shoulder joint",-1),
            new question("insertion of M. teres major","Tuberositas teres major",-1),
            new question("origin of M. teres major","Caudal angle and proximal caudal margin of the scapula",-1),
            new question("function of M. teres major","Flexion of the shoulder joint",-1),
            new question("insertion of M. biceps brachii stronger part","medially on the ulna distal to the medial coronoid process",-1),
            new question("insertion of M. biceps brachii weaker part","Tuberositas radii",-1),
            new question("origin of M. biceps brachii","Tub. supraglenoidale of the scapula",-1),
            new question("function of M. biceps brachii","Flexion of the elbow joint; extension and stabilization of the shoulder joint",-1),
            new question("insertion of M. triceps brachii","Olecranon",-1),
            new question("origin of M. triceps brachii long head","Tub. infraglenoidale and the caudal margin of the scapula",-1),
            new question("origin of M. triceps brachii lateral head","Linea m. tricipitis of the humerus",-1),
            new question("origin of M. triceps brachii medial head","Crista tuberculi minoris of the humerus",-1),
            new question("origin of M. triceps brachii accsessory head","Caudal surface of the humeral neck",-1),
            new question("function of M. biceps brachii","Extension of the elbow join",-1),
            new question("function of M. biceps brachii long head","a powerful flexor of the shoulder",-1),
            new question("insertion of M. tensor fasciae antebrachii","Olecranon",-1),
            new question("origin of M. tensor fasciae antebrachii","M. latissimus dorsi",-1),
            new question("function of M. tensor fasciae antebrachii","extension of the elbow joint",-1),
            new question("insertion of M. brachialis","medially on the ulna",-1),
            new question("origin of M. brachialis","Caudo-lateral surface of the proximal humerus",-1),
            new question("function of M. brachialis","Flexion of the elbow joint",-1),
            new question("insertion of M. anconeus","Laterally on the Olecranon",-1),
            new question("origin of M. anconeus","Lateral epicondyle and supracondylar crest and the proximo-medial rim of the Fossa olecrani ",-1),
            new question("function of M. anconeus","Extension of the elbow joint; tensing of the elbow joint capsule",-1),
            new question("insertion of M. trapezius Cervical part","The length of the Spina scapulae",-1),
            new question("insertion of M. trapezius Thoracic part","The dorsal third of the scapular spine",-1),
            new question("origin of M. trapezius Cervical part","Median fibrous raphe of the neck, as far cranially as C3 ",-1),
            new question("origin of M. trapezius Thoracic part","supraspinale",-1),
            new question("function of M. trapezius Pars cervicalis","moves the ventral angle of the scapula cranially and thus advances the limb",-1),
            new question("function of M. trapezius Pars thoracica","a rotates the scapula caudally",-1),
            new question("insertion of M. latissimus dorsi","Tuberositas teres major",-1),
            new question("origin of M. latissimus dorsi","A broad aponeurosis from the superficial thoracolumbar fascia and the lateral surfaces of the last three ribs",-1),
            new question("function of M. latissimus dorsi","Retraction of the free limb and flexion of the shoulder",-1),
            new question("insertion of M. rhomboideus capitis","Crista nuchae",-1),
            new question("insertion of M. rhomboideus cervicis","Scapula, medially on the dorsal margin",-1),
            new question("insertion of M. rhomboideus thoracis","Scapula, medially on the dorsal margin",-1),
            new question("origin of M. rhomboideus capitis","The lateral edge of the M. rhomboideus cervicis at about the level of C4.",-1),
            new question("origin of M. rhomboideus cervicis","Median fibrous raphe of the neck (as far cranially as C2) and the spinous processes of T1-T3. ",-1),
            new question("origin of M. rhomboideus thoracis","Spinous processes of T4-T7.",-1),
            new question("function of M. rhomboideus","Advances or retracts the limb",-1),
            new question("insertion of M. cleidobrachialis","Crista humeri",-1),
            new question("origin of M. cleidobrachialis","Intersectio clavicularis",-1),
            new question("insertion of M. cleidocephalicus Cervical part","Crista nuchae and the median fibrous raphe of the neck",-1),
            new question("insertion of M. cleidocephalicus Mastoid part","Mastoid process of the temporal bone",-1),
            new question("origin of M. cleidocephalicus","Intersectio clavicularis",-1),
            new question("function of M. cleidocephalicus","advances the limb",-1),
            new question("insertion of M. omotransversarius","Wing of the atlas",-1),
            new question("origin of M. omotransversarius","The ventral part of the scapular spine",-1),
            new question("function of M. omotransversarius","advance the limb",-1),
    };

    private static question[][] questions_arr = {cat0,cat1};

    static question getRandomQuestions(int cat_number, int number_of_questions_for_cat) {
        if (cat_number >= 0) {
            Random rand = new Random();
            int question_number = rand.nextInt(number_of_questions_for_cat);
            return questions_arr[cat_number][question_number];
        }
        else {
            Random rand = new Random();
            int random_cat_number = rand.nextInt(questions_arr.length);
            int question_number = rand.nextInt(get_number_of_question_cat(random_cat_number));
            return questions_arr[random_cat_number][question_number];
        }
    }

    static int get_number_of_question_cat(int cat) {
        if (cat >= 0)
            return questions_arr[cat].length;
        else {
            int counter = 0;
            for (question[] arr:questions_arr) {
                counter += arr.length;
            }
            return counter;
        }
    }
}