package com.fitnessr.adapterfitnessr

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.fitnessr.R
import com.fitnessr.databinding.FitnessItemBinding
import com.fitnessr.datafitness.FitessrData
import com.fitnessr.screensfit.DetailFitPage
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class FitnessrAdapter(val listFitness : List<FitessrData>,val activity : AppCompatActivity) : RecyclerView.Adapter<FitnessrAdapter.FitHolder>() {
    class FitHolder(val binding: FitnessItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun setFitnessData(item : FitessrData,activity : AppCompatActivity) = with(binding){

            Picasso.get().load(item.imgFit).centerCrop().resize(600,900)
                .into(mainFitImg,object : Callback{
                    override fun onSuccess() {
                        pFitBar.visibility = View.GONE
                    }

                    override fun onError(e: Exception?) {

                    }

                })
          catTvTitle.text = activity.getString(item.mainTitileFit)
          tvTitleFit.text = activity.getString(item.titleFit)
          tvDescFit.text = activity.getString(item.descFit)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FitHolder {
        val bindFitnes = FitnessItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FitHolder(bindFitnes)

    }

    override fun onBindViewHolder(holder: FitHolder, position: Int) {
        holder.setFitnessData(listFitness[position],activity)
        holder.itemView.setOnClickListener {
            val i = Intent(activity,DetailFitPage::class.java).apply {
                putExtra(DESC, activity.getString(listFitness[position].descFit))
                putExtra(TITLE, activity.getString(listFitness[position].titleFit))
            }
            activity.startActivity(i)
        }
    }

    override fun getItemCount(): Int = listFitness.size

    companion object {
        const val DESC = "desc"
        const val TITLE = "title"
    }
}