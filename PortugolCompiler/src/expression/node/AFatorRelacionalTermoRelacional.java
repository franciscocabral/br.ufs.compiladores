/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AFatorRelacionalTermoRelacional extends PTermoRelacional
{
    private PFatorRelacional _fatorRelacional_;

    public AFatorRelacionalTermoRelacional()
    {
        // Constructor
    }

    public AFatorRelacionalTermoRelacional(
        @SuppressWarnings("hiding") PFatorRelacional _fatorRelacional_)
    {
        // Constructor
        setFatorRelacional(_fatorRelacional_);

    }

    @Override
    public Object clone()
    {
        return new AFatorRelacionalTermoRelacional(
            cloneNode(this._fatorRelacional_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFatorRelacionalTermoRelacional(this);
    }

    public PFatorRelacional getFatorRelacional()
    {
        return this._fatorRelacional_;
    }

    public void setFatorRelacional(PFatorRelacional node)
    {
        if(this._fatorRelacional_ != null)
        {
            this._fatorRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorRelacional_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fatorRelacional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fatorRelacional_ == child)
        {
            this._fatorRelacional_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fatorRelacional_ == oldChild)
        {
            setFatorRelacional((PFatorRelacional) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
