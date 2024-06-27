import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.article.R

class ArticleAdapter (val article:List<Article>):RecyclerView.Adapter<ArticleViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.article_list_item,parent,false)
        return ArticleViewHolder(itemView)
    }


    override fun getItemCount(): Int {
        return article.size
    }


    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article= article[position]
        holder.tvName.text=article.name
        holder.tvPublish.text=article.publish
        holder.tvTittle.text=article.title
        holder.tvPreview.text=article.preview
        holder.tvLink.text=article.link

    }
}

class  ArticleViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val tvName=itemView.findViewById<TextView>(R.id.tvName)
    val tvPublish=itemView.findViewById<TextView>(R.id.tvPublish)
    val tvTittle=itemView.findViewById<TextView>(R.id.tvTittle)
    val tvPreview=itemView.findViewById<TextView>(R.id.tvPreview)
    val tvLink=itemView.findViewById<TextView>(R.id.tvLink)
}