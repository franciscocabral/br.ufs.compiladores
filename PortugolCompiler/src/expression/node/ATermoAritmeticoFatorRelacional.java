/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ATermoAritmeticoFatorRelacional extends PFatorRelacional
{
    private PTermoAritmetico _termoAritmetico_;

    public ATermoAritmeticoFatorRelacional()
    {
        // Constructor
    }

    public ATermoAritmeticoFatorRelacional(
        @SuppressWarnings("hiding") PTermoAritmetico _termoAritmetico_)
    {
        // Constructor
        setTermoAritmetico(_termoAritmetico_);

    }

    @Override
    public Object clone()
    {
        return new ATermoAritmeticoFatorRelacional(
            cloneNode(this._termoAritmetico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermoAritmeticoFatorRelacional(this);
    }

    public PTermoAritmetico getTermoAritmetico()
    {
        return this._termoAritmetico_;
    }

    public void setTermoAritmetico(PTermoAritmetico node)
    {
        if(this._termoAritmetico_ != null)
        {
            this._termoAritmetico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoAritmetico_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoAritmetico_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoAritmetico_ == child)
        {
            this._termoAritmetico_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoAritmetico_ == oldChild)
        {
            setTermoAritmetico((PTermoAritmetico) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}