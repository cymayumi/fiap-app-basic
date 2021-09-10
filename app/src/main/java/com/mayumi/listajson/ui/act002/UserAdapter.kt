package com.mayumi.listajson.ui.act002


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mayumi.listajson.R
import com.mayumi.listajson.model.Users
import kotlinx.android.synthetic.main.celula_users.view.*


class UserAdapter(
    private var listaUsers: List<Users>
) : RecyclerView.Adapter<UserAdapter.UsersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.celula_users, parent, false)
        return UsersViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listaUsers.count()
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        holder.bindView(listaUsers[position])
    }

    class UsersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val ds_espaco = itemView.cel_ds_espaco
        private val cel_bairro = itemView.cel_bairro
        private val cel_cidade = itemView.cel_cidade
        private val cel_largura = itemView.cel_largura
        private val cel_comprimento = itemView.cel_comprimento
        private val cel_area = itemView.cel_area

        fun bindView(users: Users) {
            ds_espaco.text = users.dsEspaco
            cel_bairro.text = users.endereco.bairro
            cel_cidade.text = users.endereco.cidade
            cel_largura.text = users.dimensoes.largura.toString()
            cel_comprimento.text = users.dimensoes.comprimento.toString()
            cel_area.text = users.dimensoes.area.toString()




//            itemView.setOnClickListener {
//                val mIntent = Intent(itemView.context, ReposActivity::class.java)
//                mIntent.putExtra(Constantes.USER, nome_user.text.toString())
//                itemView.context.startActivity(mIntent)
//            }
        }
    }
}