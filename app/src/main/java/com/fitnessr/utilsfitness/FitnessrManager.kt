package com.fitnessr.utilsfitness

import com.fitnessr.R
import com.fitnessr.datafitness.FitessrData

object FitnessrManager {

   val listAllFit = arrayListOf<FitessrData>(
       // Вид тренировок
       FitessrData(R.drawable.yoga,R.string.vid_fintess_single_title,R.string.yoga_title,R.string.yoga_desc),
       FitessrData(R.drawable.tayzi,R.string.vid_fintess_single_title,R.string.taizi_title,R.string.taizi_desc),
       FitessrData(R.drawable.pilates,R.string.vid_fintess_single_title,R.string.pilates_title,R.string.pilates_desc),
       FitessrData(R.drawable.dance_aerobik,R.string.vid_fintess_single_title,R.string.dance_aero_title,R.string.dance_aero_desc),
       FitessrData(R.drawable.pole_dance,R.string.vid_fintess_single_title,R.string.pole_title,R.string.pole_desc),
       FitessrData(R.drawable.sheyping,R.string.vid_fintess_single_title,R.string.sheyping_title,R.string.sheyping_desc),


       // Тип тренировок
       FitessrData(R.drawable.silovoy_training,R.string.type_fintess_single_title,R.string.silovoy_training_title,R.string.silovoy_training_desc),
       FitessrData(R.drawable.base_training,R.string.type_fintess_single_title,R.string.base_training_title,R.string.base_training_desc),
       FitessrData(R.drawable.krug_training,R.string.type_fintess_single_title,R.string.krug_training_title,R.string.krug_training_desc),
       FitessrData(R.drawable.hit_training,R.string.type_fintess_single_title,R.string.hit_training_title,R.string.hit_training_desc),
       FitessrData(R.drawable.obemnuy_training,R.string.type_fintess_single_title,R.string.obem_training_title,R.string.obem_training_desc),


       // Упражнение
       FitessrData(R.drawable.shim_ganteley,R.string.exercise_single_title,R.string.silovoy_training_title,R.string.silovoy_training_desc),
       FitessrData(R.drawable.rasgib_ruk,R.string.exercise_single_title,R.string.razgibanie_title,R.string.razgibanie_desc),
       FitessrData(R.drawable.shim_stoya,R.string.exercise_single_title,R.string.shim_title,R.string.shim_desc),
       FitessrData(R.drawable.low_planka,R.string.exercise_single_title,R.string.low_planka_title,R.string.low_planka_desc),
       FitessrData(R.drawable.visokaya_planka,R.string.exercise_single_title,R.string.high_planka_title,R.string.high_planka_desc),
       FitessrData(R.drawable.most,R.string.exercise_single_title,R.string.most_title,R.string.most_desc),




   )

    val listVidTraining = arrayListOf<FitessrData>(
        FitessrData(R.drawable.yoga,R.string.vid_fintess_single_title,R.string.yoga_title,R.string.yoga_desc),
        FitessrData(R.drawable.tayzi,R.string.vid_fintess_single_title,R.string.taizi_title,R.string.taizi_desc),
        FitessrData(R.drawable.pilates,R.string.vid_fintess_single_title,R.string.pilates_title,R.string.pilates_desc),
        FitessrData(R.drawable.dance_aerobik,R.string.vid_fintess_single_title,R.string.dance_aero_title,R.string.dance_aero_desc),
        FitessrData(R.drawable.pole_dance,R.string.vid_fintess_single_title,R.string.pole_title,R.string.pole_desc),
        FitessrData(R.drawable.sheyping,R.string.vid_fintess_single_title,R.string.sheyping_title,R.string.sheyping_desc),
    )

    val listTypeTraining = arrayListOf<FitessrData>(
        FitessrData(R.drawable.silovoy_training,R.string.type_fintess_single_title,R.string.silovoy_training_title,R.string.silovoy_training_desc),
        FitessrData(R.drawable.base_training,R.string.type_fintess_single_title,R.string.base_training_title,R.string.base_training_desc),
        FitessrData(R.drawable.krug_training,R.string.type_fintess_single_title,R.string.krug_training_title,R.string.krug_training_desc),
        FitessrData(R.drawable.hit_training,R.string.type_fintess_single_title,R.string.hit_training_title,R.string.hit_training_desc),
        FitessrData(R.drawable.obemnuy_training,R.string.type_fintess_single_title,R.string.obem_training_title,R.string.obem_training_desc),
    )

    val listExercises = arrayListOf<FitessrData>(
        FitessrData(R.drawable.shim_ganteley,R.string.exercise_single_title,R.string.silovoy_training_title,R.string.silovoy_training_desc),
        FitessrData(R.drawable.rasgib_ruk,R.string.exercise_single_title,R.string.razgibanie_title,R.string.razgibanie_desc),
        FitessrData(R.drawable.shim_stoya,R.string.exercise_single_title,R.string.shim_title,R.string.shim_desc),
        FitessrData(R.drawable.low_planka,R.string.exercise_single_title,R.string.low_planka_title,R.string.low_planka_desc),
        FitessrData(R.drawable.visokaya_planka,R.string.exercise_single_title,R.string.high_planka_title,R.string.high_planka_desc),
        FitessrData(R.drawable.most,R.string.exercise_single_title,R.string.most_title,R.string.most_desc),
    )
}